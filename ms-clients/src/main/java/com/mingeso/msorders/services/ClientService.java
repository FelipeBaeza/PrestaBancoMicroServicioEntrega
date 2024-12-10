package com.mingeso.msorders.services;

import com.mingeso.msorders.entities.ClientEntity;
import com.mingeso.msorders.repositories.ClientRepository;
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

    public ClientEntity findClientByRut(String rut) {
        return clientRepository.findByRut(rut).orElse(null);
    }

    public ClientEntity updateClient(ClientEntity client) {
        return clientRepository.save(client);
    }


}

