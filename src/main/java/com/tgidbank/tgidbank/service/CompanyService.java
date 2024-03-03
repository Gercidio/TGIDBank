package com.tgidbank.tgidbank.service;

import com.tgidbank.tgidbank.client.WebhookClient;
import com.tgidbank.tgidbank.model.Company;
import com.tgidbank.tgidbank.model.Transaction;
import com.tgidbank.tgidbank.repository.CompanyRepository;
import com.tgidbank.tgidbank.repository.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

	@Autowired
    private CompanyRepository companyRepository;
	@Autowired
    private TransactionRepository transactionRepository;
	@Autowired
    private WebhookClient webhookClient;
    
    public CompanyService(CompanyRepository companyRepository, TransactionRepository transactionRepository,
                          WebhookClient webhookClient, CompanyNotificationService companyNotificationService) {
        this.companyRepository = companyRepository;
        this.transactionRepository = transactionRepository;
        this.webhookClient = webhookClient;
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public Optional<Company> findById(Long id) {
        return companyRepository.findById(id);
    }

    public Company save(Company company) {
        return companyRepository.save(company);
    }

    public void makeTransaction(Company company, BigDecimal value) {
        Transaction transaction = new Transaction();
        transaction.setCompany(company);
        transaction.setValue(value);

        transactionRepository.save(transaction);

        webhookClient.sendNotificationCompany("Transaction carried out: " + value);

    }
}
