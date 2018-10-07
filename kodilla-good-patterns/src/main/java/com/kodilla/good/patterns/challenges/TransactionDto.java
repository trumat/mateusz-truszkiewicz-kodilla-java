package com.kodilla.good.patterns.challenges;

public class TransactionDto {
    String transactionID;
    boolean isCompleted;

    public TransactionDto(String transactionID, boolean isCompleted) {
        this.transactionID = transactionID;
        this.isCompleted = isCompleted;
    }
}
