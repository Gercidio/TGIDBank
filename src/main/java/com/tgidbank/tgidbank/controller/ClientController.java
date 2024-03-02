package com.tgidbank.tgidbank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tgidbank.tgidbank.model.Client;
import com.tgidbank.tgidbank.repository.ClientRepository;

@RestController
@RequestMapping("/clients")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClientController {

	 @Autowired
	    private ClientRepository clientRepository;

	    @GetMapping
	    public List<Client> getAllClients() {
	        return clientRepository.findAll();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Client> getClientById(@PathVariable Long id) {
	        Optional<Client> client = clientRepository.findById(id);
	        return client.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	    }

	    @PostMapping
	    public ResponseEntity<Client> createClient(@RequestBody Client client) {
	        Client createdClient = clientRepository.save(client);
	        return ResponseEntity.status(HttpStatus.CREATED).body(createdClient);
	    }
	

}
