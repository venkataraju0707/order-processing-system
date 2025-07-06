package com.order.rules;

import com.order.models.Customer;
import com.order.models.Order;
import com.order.models.ProductType;
import com.order.services.EmailService;
import com.order.services.MembershipService;

public class MembershipActivationRule implements BusinessRule {

    private final MembershipService membershipService;
    private final EmailService emailService;

    public MembershipActivationRule(MembershipService membershipService, EmailService emailService) {
        this.membershipService = membershipService;
        this.emailService = emailService;
    }

    @Override
    public void apply(Order order, Customer customer) {
        if (order.getProductType() == ProductType.MEMBERSHIP_ACTIVATION) {
            membershipService.activate(customer);
            emailService.sendEmail(customer.getEmail(), "Membership Activated", "Your membership has been activated.");
        }
    }
}
