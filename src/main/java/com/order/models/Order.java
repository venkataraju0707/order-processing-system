package com.order.models;

public class Order {
    private final ProductType productType;
    private final String productName;

    public Order(ProductType productType, String productName) {
        this.productType = productType;
        this.productName = productName;
    }

    public ProductType getProductType() {
        return productType;
    }

    public String getProductName() {
        return productName;
    }
}
