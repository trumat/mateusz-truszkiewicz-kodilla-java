package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.extra.food.shop.ExtraFoodShop;

public class Application {
    public static void main (String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        User customer = new User("jsmith", "John Smith", "XYZ", "xyz@abc.com");
        Order order = new Order("ExtraTomatoes", 10, customer);
        Producer producer = new ExtraFoodShop();
        orderProcessor.processOrder(producer, order);
    }
}
