package com.tgidbank.tgidbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tgidbank.tgidbank.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
