package com.order.rules;

import com.order.models.Customer;
import com.order.models.Order;
import com.order.models.ProductType;
import com.order.services.CommissionService;
import com.order.services.PackingSlipService;

public class BookRule implements BusinessRule {

    private final PackingSlipService packingSlipService;
    private final CommissionService commissionService;

    public BookRule(PackingSlipService packingSlipService, CommissionService commissionService) {
        this.packingSlipService = packingSlipService;
        this.commissionService = commissionService;
    }

    @Override
    public void apply(Order order, Customer customer) {
        if (order.getProductType() == ProductType.BOOK) {
            packingSlipService.generateForShipping(order);
            packingSlipService.generateForRoyaltyDepartment(order);
            commissionService.generateCommission(customer, order);
        }
    }
}
