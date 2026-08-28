package com.CarSale.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.ResponseEntity;

import com.CarSale.service.ClientService;
import com.CarSale.model.Client;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<Void> createClient(@RequestBody Client client) {
        clientService.saveClient(client);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Client> getClientById(@RequestParam Long id) {
        return ResponseEntity.ok(clientService.getClientById(id));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteClient(@RequestParam Long id) {
        clientService.deleteClient(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> updateClient(@RequestBody Client client) {
        clientService.saveClient(client);
        return ResponseEntity.ok().build();
    }

}
