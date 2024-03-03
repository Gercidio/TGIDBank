package com.tgidbank.tgidbank.service;

import com.tgidbank.tgidbank.client.WebhookClient;
import com.tgidbank.tgidbank.model.Client;
import com.tgidbank.tgidbank.model.Company;
import com.tgidbank.tgidbank.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ClientService {

	@Autowired
    private ClientRepository clientRepository;
	@Autowired
    private WebhookClient webhookClient;
	@Autowired
    private CompanyNotificationService companyNotificationService;

    
    public ClientService(ClientRepository clientRepository, WebhookClient webhookClient, CompanyNotificationService companyNotificationService) {
        this.clientRepository = clientRepository;
        this.webhookClient = webhookClient;
        this.companyNotificationService = companyNotificationService;
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }

    public void makeTransaction(Client client, Company company, BigDecimal value) {
    	
    }
}
