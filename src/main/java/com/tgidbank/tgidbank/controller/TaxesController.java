package com.tgidbank.tgidbank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tgidbank.tgidbank.model.Taxes;
import com.tgidbank.tgidbank.service.TaxesService;

@RestController
@RequestMapping("/taxes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TaxesController {

	@Autowired
    private TaxesService taxesService;

    
    public TaxesController(TaxesService taxesService) {
        this.taxesService = taxesService;
    }

    @GetMapping
    public List<Taxes> getAllTaxes() {
        return taxesService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Taxes> getTaxesById(@PathVariable Long id) {
        Optional<Taxes> taxes = taxesService.findById(id);
        return taxes.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Taxes> createTaxes(@RequestBody Taxes taxes) {
        Taxes createdTaxes = taxesService.save(taxes);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTaxes);
    }
}
