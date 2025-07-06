package com.order.services;

import com.order.models.Customer;

public class MembershipService {
    public void activate(Customer customer) {
        System.out.println("Membership activated for: " + customer.getName());
    }

    public void upgrade(Customer customer) {
        System.out.println("Membership upgraded for: " + customer.getName());
    }
}
