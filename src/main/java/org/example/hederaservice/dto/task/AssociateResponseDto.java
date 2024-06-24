package org.example.hederaservice.dto.task;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AssociateResponseDto {
    private int thread;
    private String accountAddress;
    private String privateKey;
    private List<String> tokens;
    private List<String> associatedAddresses;
}
