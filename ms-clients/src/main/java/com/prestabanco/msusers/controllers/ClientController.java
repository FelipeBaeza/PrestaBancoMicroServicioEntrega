package com.prestabanco.msusers.controllers;

import com.prestabanco.msusers.entities.ClientEntity;
import com.prestabanco.msusers.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController // json file
@RequestMapping("/api/v1/clients")
public class ClientController {

    @Autowired // spring injection
    ClientService clientService;

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

    @GetMapping("/findClientByrut/{rut}")
    public ResponseEntity<?> findClientByrut(@PathVariable String rut) {
        return ResponseEntity.ok(clientService.findClientByRut(rut));
    }

    @PutMapping("/updateClient")
    public ResponseEntity<?> updateClient(@RequestBody ClientEntity client) {
        return ResponseEntity.ok(clientService.updateClient(client));
    }

}
