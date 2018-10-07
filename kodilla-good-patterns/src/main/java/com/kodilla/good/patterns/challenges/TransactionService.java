package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface TransactionService {
    boolean performTransaction(User buyer, User seller, String itemCode, LocalDate transactionDate);
}
