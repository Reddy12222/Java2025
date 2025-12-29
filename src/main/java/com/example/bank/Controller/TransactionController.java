package com.example.bank.Controller;

import com.example.bank.service.FundTransferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    private final FundTransferService fundTransferService;

    public TransactionController (FundTransferService fundTransferService) {
        this.fundTransferService = fundTransferService;
    }

    @PostMapping("/transfer")
    public ResponseEntity<String> transferMoney(
            @RequestParam String fromId,
            @RequestParam String toId,
            @RequestParam BigDecimal amount
    ){
        fundTransferService.transferMoney(fromId, toId, amount);

       return ResponseEntity.ok("Transfer successful");
    }

}
