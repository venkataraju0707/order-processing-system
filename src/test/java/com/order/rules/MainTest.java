package com.order.rules;

import com.order.OrderProcessor;
import com.order.models.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private final OrderProcessor processor = new OrderProcessor();

    @Test
    public void testPhysicalProduct() {
        Customer customer = new Customer("Alice", "alice@example.com");
        Order order = new Order(ProductType.PHYSICAL_PRODUCT, "Laptop");
        assertDoesNotThrow(() -> processor.process(order, customer));
    }

    @Test
    public void testBookOrder() {
        Customer customer = new Customer("Bob", "bob@example.com");
        Order order = new Order(ProductType.BOOK, "Clean Code");
        assertDoesNotThrow(() -> processor.process(order, customer));
    }

    @Test
    public void testVideoOrder() {
        Customer customer = new Customer("Raj", "raj@example.com");
        Order order = new Order(ProductType.VIDEO, "Learning to Ski");
        assertDoesNotThrow(() -> processor.process(order, customer));
    }

    @Test
    public void testMembershipActivation() {
        Customer customer = new Customer("Sneha", "sneha@example.com");
        Order order = new Order(ProductType.MEMBERSHIP_ACTIVATION, "Premium");
        assertDoesNotThrow(() -> processor.process(order, customer));
    }

    @Test
    public void testMembershipUpgrade() {
        Customer customer = new Customer("Kiran", "kiran@example.com");
        Order order = new Order(ProductType.MEMBERSHIP_UPGRADE, "Gold Upgrade");
        assertDoesNotThrow(() -> processor.process(order, customer));
    }

   
}
