package com.prestabanco.msusers.services;

import com.prestabanco.msusers.entities.ClientEntity;
import com.prestabanco.msusers.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

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