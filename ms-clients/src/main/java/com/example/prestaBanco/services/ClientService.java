package com.example.prestaBanco.services;

import com.example.prestaBanco.entities.ClientEntity;
import com.example.prestaBanco.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public ClientEntity findClientByRut(String rut) {
        return clientRepository.findByRut(rut).orElse(null);
    }

    public ClientEntity updateClient(ClientEntity client) {
        return clientRepository.save(client);
    }


}
