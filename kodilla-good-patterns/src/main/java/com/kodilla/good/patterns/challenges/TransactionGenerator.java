package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class TransactionGenerator {

    public Transaction generate() {
        User buyer = new User ("xxy", "xxy@abc.pl");
        User seller = new User ("topseller", "beststore@beststore.pl");
        return new Transaction(seller, buyer, "CV12456", "34500001", LocalDate.now());
    }
}
