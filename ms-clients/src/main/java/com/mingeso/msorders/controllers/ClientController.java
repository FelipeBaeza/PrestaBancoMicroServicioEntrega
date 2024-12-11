package com.mingeso.msorders.controllers;

import com.mingeso.msorders.entities.ClientEntity;
import com.mingeso.msorders.services.ClientService;
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

    @GetMapping("/findClientByrut/{rut}")
    public ResponseEntity<?> findClientByrut(@PathVariable String rut) {
        return ResponseEntity.ok(clientService.findClientByRut(rut));
    }

    @GetMapping("/validateRutAndPassword/{rut}/{password}")
    public ResponseEntity<?> validateRutAndPassword(@PathVariable String rut, @PathVariable String password) {
        return ResponseEntity.ok(clientService.validateClient(rut, password));
    }

    @GetMapping("/allClients")
    public ResponseEntity<?> allClients() {
        return ResponseEntity.ok(clientService.allClients());
    }

    @PutMapping("/updateClient")
    public ResponseEntity<?> updateClient(@RequestBody ClientEntity client) {
        return ResponseEntity.ok(clientService.updateClient(client));
    }
}

