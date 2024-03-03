package com.tgidbank.tgidbank.client;

import org.springframework.stereotype.Component;

@Component
public class WebhookClient {

    public void sendNotificationCompany(String message) {
        System.out.println("Notification sent to Company: " + message);
    }

    public void sendNotificationClient(String email, String message) {
        System.out.println("Email sent to Client (" + email + "): " + message);
    }
}
