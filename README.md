🧠 Business problem

This code implements a bank fund transfer use case:

    Transfer money from one bank account to another safely and correctly.

    “I implemented a fund transfer API using Spring Boot. The controller handles HTTP requests, 
    the service layer contains validation and transactional business logic, and the repository manages persistence. 
    The transfer is atomic, logged, and production-ready.
🧩 What the code does

Your FundTransferService:
    
    Validates input (accounts, amount)
    
    Fetches accounts from DB
    
    Checks balance
    
    Debits & credits accounts
    
    Saves changes in a transaction
    
    Logs the transfer
🏗 Architecture (important for interviews)
    Controller (REST API)
    ↓
    Service (Business logic)   <-- YOU ARE HERE
    ↓
    Repository (Database)
    

Your code is the SERVICE layer.
@Service
@Slf4j
public class FundTransferService {
@Service → Spring-managed business component

@Slf4j → Logger available as log
--
@Transactional
public void transferMoney(String fromId, String toId, BigDecimal amount)
@Transactional → ALL or NOTHING

If any error occurs → rollback

This is the main business method

--
validateRequest(fromId, toId, amount);

Defensive validation
Prevents bad data early

