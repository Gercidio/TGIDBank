package com.tgidbank.tgidbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tgidbank.tgidbank.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
