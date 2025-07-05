package com.order.rules;

import com.order.models.Customer;
import com.order.models.Order;

public interface BusinessRule {
    void apply(Order order, Customer customer);
}
