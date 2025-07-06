package com.order.rules;

import com.order.models.Customer;
import com.order.models.Order;
import com.order.models.ProductType;
import com.order.services.PackingSlipService;

public class VideoRule implements BusinessRule {

    private final PackingSlipService packingSlipService;

    public VideoRule(PackingSlipService packingSlipService) {
        this.packingSlipService = packingSlipService;
    }

    @Override
    public void apply(Order order, Customer customer) {
        if (order.getProductType() == ProductType.VIDEO && "Learning to Ski".equalsIgnoreCase(order.getProductName())) {
            packingSlipService.addFreeVideo(order, "First Aid");
        }
    }
}
