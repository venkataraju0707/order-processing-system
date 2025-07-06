package com.order.services;

public class EmailService {
    public void sendEmail(String to, String subject, String message) {
        System.out.println("Email sent to " + to + ": [" + subject + "] - " + message);
    }
}
