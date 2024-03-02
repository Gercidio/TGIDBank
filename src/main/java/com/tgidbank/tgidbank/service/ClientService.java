package com.tgidbank.tgidbank.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.tgidbank.tgidbank.client.WebhookClient;
import com.tgidbank.tgidbank.model.Client;
import com.tgidbank.tgidbank.model.Company;
import com.tgidbank.tgidbank.repository.ClientRepository;
import com.tgidbank.tgidbank.repository.CompanyRepository;
import com.tgidbank.tgidbank.repository.TaxesRepository;

public class ClientService {

	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	CompanyRepository companyRepository;
	
	@Autowired
	TaxesRepository taxesRepository;
	
	private final WebhookClient webhookClient;

    public ClientService(WebhookClient webhookClient) {
        this.webhookClient = webhookClient;
    }

    public void makeTransaction(Client client, Company company, BigDecimal value) {
        // Verifique saldos, aplique taxas, etc.

        // callback 
        webhookClient.sendNotificationCompany("Transaction carried out: " + value);

        //  notificação para Cliente
        webhookClient.sendNotificationCompany("Transaction carried out: " + value);
    }

    
}
