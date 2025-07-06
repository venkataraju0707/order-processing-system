package com.order.rules;

import com.order.models.Customer;
import com.order.models.Order;
import com.order.models.ProductType;
import com.order.services.EmailService;
import com.order.services.MembershipService;

public class MembershipUpgradeRule implements BusinessRule {

    private final MembershipService membershipService;
    private final EmailService emailService;

    public MembershipUpgradeRule(MembershipService membershipService, EmailService emailService) {
        this.membershipService = membershipService;
        this.emailService = emailService;
    }

    @Override
    public void apply(Order order, Customer customer) {
        if (order.getProductType() == ProductType.MEMBERSHIP_UPGRADE) {
            membershipService.upgrade(customer);
            emailService.sendEmail(customer.getEmail(), "Membership Upgraded", "Your membership has been upgraded.");
        }
    }
}
