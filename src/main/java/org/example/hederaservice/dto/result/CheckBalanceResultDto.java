package org.example.hederaservice.dto.result;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CheckBalanceResultDto extends BaseResultDto {
    private String tokenId;
    private String accountAddress;
    private int balance;
}
