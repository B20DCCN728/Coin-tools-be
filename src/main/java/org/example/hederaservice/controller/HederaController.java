package org.example.hederaservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hedera/api/v1")
public class HederaController {
    @PostMapping("/multiple-tranfer")
    public String multipleTransfer() {
        return "Multiple transfer";
    }
}
