package org.example.hederaservice.dto.task;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter
public class CreateAccountDto extends BaseResponseDto {
    private int numberOfAccounts;
}
