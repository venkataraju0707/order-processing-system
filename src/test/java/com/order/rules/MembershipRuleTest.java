// MembershipRuleTest.java
package com.order.rules;

import com.order.models.*;
import com.order.services.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class MembershipRuleTest {

    @Test
    public void testActivateMembership() {
        Customer customer = new Customer("Test User", "test@example.com");
        Order order = new Order(ProductType.MEMBERSHIP_ACTIVATION, "Activate");

        MembershipService membershipService = new MembershipService();
        EmailService emailService = new EmailService();

        MembershipActivationRule rule = new MembershipActivationRule(membershipService, emailService);
        assertDoesNotThrow(() -> rule.apply(order, customer));
    }

    @Test
    public void testUpgradeMembership() {
        Customer customer = new Customer("Upgrade User", "upgrade@example.com");
        Order order = new Order(ProductType.MEMBERSHIP_UPGRADE, "Upgrade");

        MembershipService membershipService = new MembershipService();
        EmailService emailService = new EmailService();

        MembershipUpgradeRule rule = new MembershipUpgradeRule(membershipService, emailService);
        assertDoesNotThrow(() -> rule.apply(order, customer));
    }
}
