package org.example.hederaservice.controller;

import com.hedera.hashgraph.sdk.Status;
import org.example.hederaservice.dto.ResultResponseDto;
import org.example.hederaservice.dto.TranferResponseDto;
import org.example.hederaservice.service.HederaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hedera/api/v1")
public class HederaController {
    @Autowired
    private HederaService hederaService;
    @PostMapping("/multiple-tranfer")
    public List<ResultResponseDto> multipleTransfer(@RequestBody TranferResponseDto tranferResponseDto) throws InterruptedException {
        return hederaService.multipleTransfer(tranferResponseDto);
    }
}
