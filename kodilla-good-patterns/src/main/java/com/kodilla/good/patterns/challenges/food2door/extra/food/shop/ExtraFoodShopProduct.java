package com.kodilla.good.patterns.challenges.food2door.extra.food.shop;

public class ExtraFoodShopProduct {
    String productName;
    int productQuantity;
    double productPrice;

    public ExtraFoodShopProduct(String productName, int productQuantity, double productPrice) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void changeQuantity(int change) {
        this.productQuantity = this.productQuantity + change;
    }
}
