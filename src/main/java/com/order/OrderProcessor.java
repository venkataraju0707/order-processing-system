package com.order;

import com.order.models.Order;
import com.order.models.Customer;
import com.order.rules.*;
import com.order.services.*;

import java.util.Arrays;
import java.util.List;

public class OrderProcessor {
    private final List<BusinessRule> rules;

    public OrderProcessor() {
        EmailService emailService = new EmailService();
        MaintenanceService maintenanceService = new MaintenanceService();

        this.rules = Arrays.asList(
            new MaintenanceRule(maintenanceService, emailService)
        );
    }

    public void process(Order order, Customer customer) {
        for (BusinessRule rule : rules) {
            rule.apply(order, customer);
        }
    }
}
