package com.tgidbank.tgidbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tgidbank.tgidbank.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
