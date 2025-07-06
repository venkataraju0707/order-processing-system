package com.order;

import com.order.models.Customer;
import com.order.models.Order;
import com.order.rules.*;
import com.order.services.*;

import java.util.Arrays;
import java.util.List;

public class OrderProcessor {

    private final List<BusinessRule> rules;

    public OrderProcessor() {
        PackingSlipService packingSlipService = new PackingSlipService();
        CommissionService commissionService = new CommissionService();
        EmailService emailService = new EmailService();
        MembershipService membershipService = new MembershipService();

        this.rules = Arrays.asList(
                new PhysicalProductRule(packingSlipService, commissionService),
                new BookRule(packingSlipService, commissionService),
                new VideoRule(packingSlipService),
                new MembershipActivationRule(membershipService, emailService),
                new MembershipUpgradeRule(membershipService, emailService)
        );
    }

    public void process(Order order, Customer customer) {
        if (order == null) {
            System.err.println("Order is null. Skipping processing.");
            return;
        }
        if (customer == null) {
            System.err.println("Customer is null. Skipping processing.");
            return;
        }

        for (BusinessRule rule : rules) {
            rule.apply(order, customer);
        }
    }
}
