package com.CarSale.service;

import com.CarSale.repository.ClientRepository;
import com.CarSale.model.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void saveClient(Client client) {
        clientRepository.saveAndFlush(client);
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public Client updateClient(Client client) {
        return clientRepository.saveAndFlush(client);
    }

}
