package com.order.services;

public class MaintenanceService {
    public void renew(String contractType, String customerName) {
        System.out.println("🔁 Renewed maintenance for '" + contractType + "' for customer: " + customerName);
    }
}
