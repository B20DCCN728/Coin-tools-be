package org.example.hederaservice.dto.result;

import com.hedera.hashgraph.sdk.Status;
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
