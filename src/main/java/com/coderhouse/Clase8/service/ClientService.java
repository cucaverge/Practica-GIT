package com.coderhouse.Clase8.service;

import com.coderhouse.Clase8.model.Client;
import com.coderhouse.Clase8.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client postClient(Client client) throws Exception {
        return clientRepository.save(client);
    }
}