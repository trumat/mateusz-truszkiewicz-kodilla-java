package com.kodilla.good.patterns.challenges;

public class ProductOrderServiceApplication {
    public static void main (String[] args) {
        TransactionGenerator transactionGenerator = new TransactionGenerator();
        Transaction transaction = transactionGenerator.generate();
        ProductOrderService productOrderService = new ProductOrderService(new MailInformationService(), new StandardTransactionService(), new StandardTransactionRepository());
        productOrderService.process(transaction);
    }
}
