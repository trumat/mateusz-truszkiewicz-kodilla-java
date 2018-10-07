package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface TransactionRepository {
    void recordTransaction(Transaction transaction);
}
