package com.order.services;

import com.order.models.Order;

public class PackingSlipService {
    public void generateForShipping(Order order) {
        System.out.println("Packing slip generated for shipping: " + order.getProductName());
    }

    public void generateForRoyaltyDepartment(Order order) {
        System.out.println("Duplicate packing slip generated for royalty department: " + order.getProductName());
    }

    public void addFreeVideo(Order order, String videoTitle) {
        System.out.println("Free video \"" + videoTitle + "\" added to the packing slip for: " + order.getProductName());
    }
}
