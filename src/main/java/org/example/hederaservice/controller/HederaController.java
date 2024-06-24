package org.example.hederaservice.controller;

import com.hedera.hashgraph.sdk.PrecheckStatusException;
import com.hedera.hashgraph.sdk.ReceiptStatusException;
import org.example.hederaservice.dto.result.CheckBalanceResultDto;
import org.example.hederaservice.dto.result.CreateResultResponseDto;
import org.example.hederaservice.dto.result.ResultResponseDto;
import org.example.hederaservice.dto.task.AssociateResponseDto;
import org.example.hederaservice.dto.task.CheckBalanceDto;
import org.example.hederaservice.dto.task.CreateAccountDto;
import org.example.hederaservice.dto.task.TranferResponseDto;
import org.example.hederaservice.service.HederaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeoutException;

@RestController
@RequestMapping("/hedera/api/v1")
public class HederaController {
    @Autowired
    private HederaService hederaService;

    // API to transfer hbar
    @PostMapping("/multiple-tranfer")
    public List<ResultResponseDto> multipleTransfer(@RequestBody TranferResponseDto tranferResponseDto)
            throws InterruptedException {
        return hederaService.multipleTransfer(tranferResponseDto);
    }

    // API to associate account
    @PostMapping("/multiple-associate")
    public List<ResultResponseDto> multipleAssociate(@RequestBody AssociateResponseDto associateResponseDto)
            throws InterruptedException {
        return hederaService.multipleAssociate(associateResponseDto);
    }
     // API to create account
    @PostMapping("/multiple-create-account")
    public List<CreateResultResponseDto> multipleCreateAccount(@RequestBody CreateAccountDto createAccountDto)
            throws InterruptedException, ReceiptStatusException, PrecheckStatusException, TimeoutException {
        return hederaService.multipleCreateAccount(createAccountDto);
    }

    // API to check balance
    @PostMapping("/multiple-check-balance")
    public List<CheckBalanceResultDto> multipleCheckBalance(@RequestBody CheckBalanceDto checkBalanceDto)
            throws InterruptedException, PrecheckStatusException, TimeoutException {
        return hederaService.checkBalance(checkBalanceDto);
    }
}
