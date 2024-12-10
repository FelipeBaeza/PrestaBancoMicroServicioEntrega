package com.mingeso.msorders.clients;

import com.mingeso.msorders.configurations.FeignClientConfig;
import com.mingeso.msorders.entities.ClientEntity;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
