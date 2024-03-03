package com.tgidbank.tgidbank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgidbank.tgidbank.model.Taxes;
import com.tgidbank.tgidbank.repository.TaxesRepository;

@Service
public class TaxesService {

	@Autowired
    private TaxesRepository taxesRepository;

    public TaxesService(TaxesRepository taxesRepository) {
        this.taxesRepository = taxesRepository;
    }

    public List<Taxes> findAll() {
        return taxesRepository.findAll();
    }

    public Optional<Taxes> findById(Long id) {
        return taxesRepository.findById(id);
    }

    public Taxes save(Taxes taxes) {
        return taxesRepository.save(taxes);
    }
}
