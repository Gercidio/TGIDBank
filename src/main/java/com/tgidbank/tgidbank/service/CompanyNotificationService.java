package com.tgidbank.tgidbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgidbank.tgidbank.client.WebHookCompany;
import com.tgidbank.tgidbank.model.Client;
import com.tgidbank.tgidbank.model.Company;

@Service
public class CompanyNotificationService {

	@Autowired
    private WebHookCompany webHookCompany;

    
    public CompanyNotificationService(WebHookCompany webHookCompany) {
        this.webHookCompany = webHookCompany;
    }

    public void sendNotificationCompany(Client client, Company company, String message) {
        message = "Transaction carried out by Client " + client.getName() + " for Company " + company.getName() + ": " + message;
        webHookCompany.sendNotificationCompany(message);
    }
}
