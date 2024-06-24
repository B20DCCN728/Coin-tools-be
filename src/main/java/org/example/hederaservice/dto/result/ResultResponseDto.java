package org.example.hederaservice.dto.result;

import com.hedera.hashgraph.sdk.Status;
import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@SuperBuilder
public class ResultResponseDto extends BaseResultDto {
    private String receivedAddress;
}
