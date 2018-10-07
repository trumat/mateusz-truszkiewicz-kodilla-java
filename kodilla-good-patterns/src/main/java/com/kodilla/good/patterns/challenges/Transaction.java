package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.Objects;

public class Transaction {
    User seller;
    User buyer;
    String itemCode;
    String transactionID;
    LocalDate transactionDate;

    public Transaction(User seller, User buyer, String itemCode, String transactionID, LocalDate transactionDate) {
        this.seller = seller;
        this.buyer = buyer;
        this.itemCode = itemCode;
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
    }

    public User getSeller() {
        return seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(transactionID, that.transactionID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionID);
    }
}
