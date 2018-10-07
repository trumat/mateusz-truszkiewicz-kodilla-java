package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StandardTransactionRepository implements TransactionRepository{
    private final List<Transaction> transactions = new ArrayList<>();

    @Override
    public void recordTransaction(Transaction transaction) {
        transactions.add(transaction);
        System.out.println("Transaction recorded");
    }
}
