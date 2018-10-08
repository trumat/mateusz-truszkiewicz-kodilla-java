package com.kodilla.good.patterns.challenges.food2door.gluten.free.shop;

import com.kodilla.good.patterns.challenges.food2door.Order;
import com.kodilla.good.patterns.challenges.food2door.Producer;

public class GlutenFreeShop implements Producer {
    GFSCommunicationService gFSCommunicationService = new GFSCommunicationService();

    @Override
    public boolean process(Order order) {
        gFSCommunicationService.transferOrder(order);
        return true;
    }
}
