package com.order.rules;

import com.order.models.Customer;
import com.order.models.Order;
import com.order.models.ProductType;
import com.order.services.MaintenanceService;
import com.order.services.EmailService;

public class MaintenanceRule implements BusinessRule {

    private final MaintenanceService maintenanceService;
    private final EmailService emailService;

    public MaintenanceRule(MaintenanceService maintenanceService, EmailService emailService) {
        this.maintenanceService = maintenanceService;
        this.emailService = emailService;
    }

    @Override
    public void apply(Order order, Customer customer) {
        if (order.getProductType() == ProductType.MAINTENANCE_APPLICATION ||
            order.getProductType() == ProductType.MAINTENANCE_CONTRACT) {

            maintenanceService.renew(order.getProductName(), customer.getName());
            emailService.sendEmail(
                customer.getEmail(),
                "Maintenance Renewed",
                "Your maintenance for " + order.getProductName() + " has been successfully renewed."
            );
        }
    }
}
