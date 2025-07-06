package com.order.services;

import com.order.models.Customer;
import com.order.models.Order;

public class CommissionService {
    public void generateCommission(Customer customer, Order order) {
        System.out.println("Commission generated for agent due to order by " + customer.getName() + " for: " + order.getProductName());
    }
}
