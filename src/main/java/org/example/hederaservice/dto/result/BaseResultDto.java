package org.example.hederaservice.dto.result;

import com.hedera.hashgraph.sdk.Status;
import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class BaseResultDto {
    private Status status;
}
