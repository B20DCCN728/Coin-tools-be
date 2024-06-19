package org.example.hederaservice.service;

import com.hedera.hashgraph.sdk.*;
import org.example.hederaservice.configuration.ClientHelper;
import org.example.hederaservice.dto.ResultResponseDto;
import org.example.hederaservice.dto.TranferResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeoutException;

@Service
public class HederaService {
    // Define Simp Message SendingOperations
    @Autowired
    private SimpMessageSendingOperations simpMessageSendingOperations;

    public List<ResultResponseDto> multipleTransfer(TranferResponseDto tranferResponseDto) throws InterruptedException {
        AccountId accountId = AccountId.fromString(tranferResponseDto.getAccountAddress());
        PrivateKey privateKey = PrivateKey.fromString(tranferResponseDto.getPrivateKey());
        Client client = getClient(
                accountId,
                privateKey,
                "mainnet"
        );
        return tranferResponseDto.getReceivedAddresses().stream()
                .map(receiveAccountId -> {
                    try {
                        TransactionResponse response = new TransferTransaction()
                                .addHbarTransfer(accountId, Hbar.fromTinybars(tranferResponseDto.getAmount() * -100000000))
                                .addHbarTransfer(AccountId.fromString(receiveAccountId), Hbar.fromTinybars(tranferResponseDto.getAmount() * 100000000))
                                .execute(client);
                        ResultResponseDto resultResponseDto = new ResultResponseDto(receiveAccountId, response.getReceipt(client).status);
                        simpMessageSendingOperations.convertAndSend("/topic/transfer", resultResponseDto);
                        return resultResponseDto;
                    } catch (TimeoutException | PrecheckStatusException | ReceiptStatusException e) {
                        throw new RuntimeException(e);
                    }
                }).toList();
    }

    // Define the getClient method
    public Client getClient(
            AccountId operatorId,
            PrivateKey operatorKey,
            String network
    ) throws
            InterruptedException
    {
        return ClientHelper.forName(network).setOperator(
                        operatorId,
                        operatorKey
                );
    }
}
