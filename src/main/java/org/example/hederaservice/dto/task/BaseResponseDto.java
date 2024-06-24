package org.example.hederaservice.dto.task;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
public class BaseResponseDto {
    private int thread;
    private String accountAddress;
    private String privateKey;
}
