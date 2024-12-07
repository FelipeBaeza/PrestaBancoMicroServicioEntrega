package com.prestabanco.msrequest.clients;

import com.prestabanco.msrequest.configurations.FeignClientConfig;
import com.prestabanco.msrequest.entities.ClientEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "ms-clients", path = "/api/v1/clients", configuration = {FeignClientConfig.class})
public interface ClientsFeignClient {

    @GetMapping("/findClientByrut/{rut}")
    ClientEntity findClientByrut(@PathVariable String rut);


    @PutMapping("/updateClient")
    ClientEntity updateClient(@RequestBody ClientEntity client);

    @GetMapping("/allClients")
    List<ClientEntity> allClients();
}
