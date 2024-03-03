package com.tgidbank.tgidbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tgidbank.tgidbank.model.Client;
import com.tgidbank.tgidbank.service.ClientService;

@RestController
@RequestMapping("/clients")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping
	public List<Client> getAllClients() {
		return clientService.findAll();
	}

	@PostMapping
	public ResponseEntity<Client> createClient(@RequestBody Client client) {
		Client createdClient = clientService.save(client);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdClient);
	}
}
