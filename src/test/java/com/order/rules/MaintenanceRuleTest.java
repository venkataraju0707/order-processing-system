package com.order.rules;

import com.order.models.Customer;
import com.order.models.Order;
import com.order.models.ProductType;
import com.order.services.EmailService;
import com.order.services.MaintenanceService;
import org.junit.jupiter.api.Test;

public class MaintenanceRuleTest {

    @Test
    public void testApplyMaintenanceRule() {
        MaintenanceService maintenanceService = new MaintenanceService();
        EmailService emailService = new EmailService();
        MaintenanceRule rule = new MaintenanceRule(maintenanceService, emailService);

        Customer customer = new Customer("John Doe", "john@example.com");
        Order order = new Order(ProductType.MAINTENANCE_APPLICATION, "CRM System");

        rule.apply(order, customer);
    }
}
