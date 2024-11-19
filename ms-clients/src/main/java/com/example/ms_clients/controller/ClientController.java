package com.example.ms_clients.controller;


import com.example.ms_clients.entities.ClientEntity;
import com.example.ms_clients.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    /**
     * Saves a new client.
     *
     * @param client the client entity to be saved
     * @return the saved client entity
     */

    @PostMapping("/save")
    public ResponseEntity<?> saveClient(@RequestBody ClientEntity client) {
        ClientEntity clientNew = clientService.saveClient(client);
        return ResponseEntity.ok(clientNew);
    }
    

    @GetMapping("/validateRutAndPassword/{rut}/{password}")
    public ResponseEntity<?> validateRutAndPassword(@PathVariable String rut, @PathVariable String password) {
        return ResponseEntity.ok(clientService.validateClient(rut, password));
    }

    @GetMapping("/allClients")
    public ResponseEntity<?> allClients() {
        return ResponseEntity.ok(clientService.allClients());
    }

}