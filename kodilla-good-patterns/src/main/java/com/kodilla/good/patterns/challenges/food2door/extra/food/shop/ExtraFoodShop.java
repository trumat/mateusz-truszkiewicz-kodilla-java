package com.kodilla.good.patterns.challenges.food2door.extra.food.shop;

import com.kodilla.good.patterns.challenges.food2door.Order;
import com.kodilla.good.patterns.challenges.food2door.Producer;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Producer {
    Map<String, ExtraFoodShopProduct> products = new HashMap<>();

    public ExtraFoodShop() {
        products.put("ExtraPotatoes", new ExtraFoodShopProduct("ExtraPotatoes", 30, 1.5));
        products.put("ExtraTomatoes", new ExtraFoodShopProduct("ExtraTomatoes", 40, 2.5));
        products.put("ExtraCabbage", new ExtraFoodShopProduct("ExtraCabbage", 100, 2));
    }

    @Override
    public boolean process(Order order) {
        if (products.containsKey(order.getProductName()) && products.get(order.getProductName()).getProductQuantity() - order.getProductQuantity() >= 0) {
            products.get(order.getProductName()).changeQuantity(- order.getProductQuantity());
            return true;
        } else {
            return false;
        }
    }
}
