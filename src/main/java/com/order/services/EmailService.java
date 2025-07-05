package com.order.services;

public class EmailService {
    public void sendEmail(String recipient, String subject, String body) {
        System.out.println("📧 Email sent to " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}
