package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class StandardTransactionService implements TransactionService {
    @Override
    public boolean performTransaction(User buyer, User seller, String itemCode, LocalDate transactionDate) {
        System.out.println("Performing transaction between seller: " + seller.getUsername() + " and buyer: " + buyer.getUsername() + ". Item code: " + itemCode + ". Transaction date: " + transactionDate);
        return true;
    }
}
