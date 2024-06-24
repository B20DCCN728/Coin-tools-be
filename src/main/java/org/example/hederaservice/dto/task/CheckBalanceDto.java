package org.example.hederaservice.dto.task;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
public class CheckBalanceDto extends BaseResponseDto {
    private String tokenId;
    private List<String> accountAddresses;
}
