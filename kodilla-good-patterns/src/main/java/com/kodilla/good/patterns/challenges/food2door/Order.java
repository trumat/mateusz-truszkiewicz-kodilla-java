package com.kodilla.good.patterns.challenges.food2door;

public class Order {
    private final String productName;
    private final int productQuantity;
    private final User customer;

    public Order(String productName, int productQuantity, User customer) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.customer = customer;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public User getCustomer() {
        return customer;
    }
}
