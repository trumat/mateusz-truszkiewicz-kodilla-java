package com.kodilla.good.patterns.challenges;

public class MailInformationService implements InformationService{
    @Override
    public void informBuyer(User user) {
        System.out.println("Sending an email notification to the buyer: " + user.getEmail());
    }

    @Override
    public void informSeller(User user) {
        System.out.println("Sending an email notification to the seller: " + user.getEmail());
    }
}
