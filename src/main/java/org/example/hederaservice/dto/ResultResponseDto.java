package org.example.hederaservice.dto;

import com.hedera.hashgraph.sdk.Status;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class ResultResponseDto {
    private String receivedAddress;
    private Status status;
}
