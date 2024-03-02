package com.tgidbank.tgidbank.client;

import org.springframework.stereotype.Component;

@Component
public class WebhookClient {

	public void sendNotificationCompanya(String message) {
        //  notificação para a Empresa
        System.out.println("Notificação enviada para Empresa: " + message);
    }

    public void sendNotificationCompany(String message) {
        // notificação para o Cliente
        System.out.println("Notificação enviada para Cliente: " + message);
    }

	
}
