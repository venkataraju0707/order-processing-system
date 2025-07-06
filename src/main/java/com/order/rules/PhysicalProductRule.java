package com.order.rules;

import com.order.models.Customer;
import com.order.models.Order;
import com.order.models.ProductType;
import com.order.services.CommissionService;
import com.order.services.PackingSlipService;

public class PhysicalProductRule implements BusinessRule {

    private final PackingSlipService packingSlipService;
    private final CommissionService commissionService;

    public PhysicalProductRule(PackingSlipService packingSlipService, CommissionService commissionService) {
        this.packingSlipService = packingSlipService;
        this.commissionService = commissionService;
    }

    @Override
    public void apply(Order order, Customer customer) {
        if (order.getProductType() == ProductType.PHYSICAL_PRODUCT) {
            packingSlipService.generateForShipping(order);
            commissionService.generateCommission(customer, order);
        }
    }
}
