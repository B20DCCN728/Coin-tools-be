package org.example.hederaservice.dto.result;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class CreateResultResponseDto extends BaseResultDto {
    private String privateKey;
    private String accountAddress;
}
