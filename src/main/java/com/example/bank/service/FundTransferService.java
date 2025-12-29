package com.example.bank.service;

import com.example.bank.entity.Account;
import com.example.bank.exception.EntityNotFoundException;
import com.example.bank.exception.InsufficientFundsException;
import com.example.bank.repository.AccountRepository;
import com.example.bank.repository.InMemoryAccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
@Slf4j
public class FundTransferService {

    private final InMemoryAccountRepository accountRepository;

    public FundTransferService(InMemoryAccountRepository accountRepository) {
        this.accountRepository = accountRepository;

//    private final AccountRepository accountRepository;
//
//    public FundTransferService(AccountRepository accountRepository) {
//        this.accountRepository = accountRepository;


}

    @Transactional
    public void transferMoney(String fromId, String toId, BigDecimal amount) {

        validateRequest(fromId, toId, amount);

        Account from = accountRepository.findById(fromId)
                .orElseThrow(() -> new EntityNotFoundException("Source account not found"));

        Account to = accountRepository.findById(toId)
                .orElseThrow(() -> new EntityNotFoundException("Destination account not found"));

        if (from.getBalance().compareTo(amount) < 0) {
            throw new InsufficientFundsException("Insufficient balance");
        }

        from.debit(amount);
        to.credit(amount);

        accountRepository.save(from);
        accountRepository.save(to);

        log.info("Transferred {} from account {} to {}", amount, fromId, toId);
    }

    private void validateRequest(String fromId, String toId, BigDecimal amount) {

        if (fromId == null || toId == null) {
            throw new IllegalArgumentException("From and To account IDs must not be null");
        }

        if (fromId.equals(toId)) {
            throw new IllegalArgumentException("From and To account IDs must be different");
        }

        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Transfer amount must be positive");
        }
    }
}
