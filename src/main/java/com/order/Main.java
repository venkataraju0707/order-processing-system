package com.order;

import com.order.models.*;
import com.order.OrderProcessor;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Venkat", "venkat@example.com");
        Order order = new Order(ProductType.MAINTENANCE_APPLICATION, "ERP System");

        OrderProcessor processor = new OrderProcessor();
        processor.process(order, customer);
    }
}
