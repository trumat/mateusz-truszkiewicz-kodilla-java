package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    InformationService informationService;
    TransactionService transactionService;
    TransactionRepository transactionRepository;

    public ProductOrderService(InformationService informationService, TransactionService transactionService, TransactionRepository transactionRepository) {
        this.informationService = informationService;
        this.transactionService = transactionService;
        this.transactionRepository = transactionRepository;
    }

    public TransactionDto process(Transaction transaction) {
        boolean isSold = transactionService.performTransaction(transaction.getBuyer(), transaction.getSeller(), transaction.getItemCode(), transaction.getTransactionDate());
        if (isSold) {
            informationService.informBuyer(transaction.getBuyer());
            informationService.informSeller(transaction.getSeller());
            transactionRepository.recordTransaction(transaction);
            return new TransactionDto(transaction.getTransactionID(), true);
        } else {
            return new TransactionDto(transaction.getTransactionID(), false);
        }
    }
}
