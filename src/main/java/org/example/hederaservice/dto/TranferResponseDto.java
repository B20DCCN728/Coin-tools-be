package org.example.hederaservice.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class TranferResponseDto {
    private String tokenAddress;
    private int thread;
    private String accountAddress;
    private String privateKey;
    private long amount;
    private List<String> receivedAddresses;
}
