package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    public void processOrder(Producer producer, Order order) {
        boolean isPlaced = producer.process(order);
        if (isPlaced) {
            System.out.println("Order successful");
        } else {
            System.out.println("Order unsuccessful");
        }
    }
}
