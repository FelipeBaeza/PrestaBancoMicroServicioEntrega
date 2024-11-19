package com.example.ms_clients.services;

import com.example.ms_clients.entities.ClientEntity;
import com.example.ms_clients.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    /**
     * Saves a new client.
     * @param client the client entity to be saved
     * @return the saved client entity
     */
    public ClientEntity saveClient(ClientEntity client) {
        return clientRepository.save(client);
    }



    public boolean validateClient(String rut, String password) {
        ClientEntity client = clientRepository.findByRut(rut).orElse(null);
        if (client == null) {
            return true;
        } else {
            return false;
        }
    }

    public List<ClientEntity> allClients() {
        return clientRepository.findAll();
    }

}
