package com.order;

import com.order.models.Customer;
import com.order.models.Order;
import com.order.models.ProductType;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Venkat", "venkat@example.com");
        Order order = new Order(ProductType.VIDEO, "Learning to Ski");

        OrderProcessor processor = new OrderProcessor();
        processor.process(order, customer);

        System.out.println("Order processed successfully.");
    }
}
