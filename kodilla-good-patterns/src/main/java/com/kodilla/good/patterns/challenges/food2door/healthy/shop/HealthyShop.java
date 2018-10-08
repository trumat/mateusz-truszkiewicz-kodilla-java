package com.kodilla.good.patterns.challenges.food2door.healthy.shop;

import com.kodilla.good.patterns.challenges.food2door.Order;
import com.kodilla.good.patterns.challenges.food2door.Producer;

public class HealthyShop implements Producer {
    HealthyShopDatabase database = new HealthyShopDatabase();

    @Override
    public boolean process(Order order) {
        if (database.isAvailable(order.getProductName(), order.getProductQuantity())) {
            return true;
        } else {
            return false;
        }
    }
}
