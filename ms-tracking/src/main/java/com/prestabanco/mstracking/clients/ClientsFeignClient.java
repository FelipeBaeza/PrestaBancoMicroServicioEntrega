package com.prestabanco.mstracking.clients;

import com.prestabanco.mstracking.configurations.FeignClientConfig;
import com.prestabanco.mstracking.entities.ClientEntity;
import com.prestabanco.mstracking.entities.CreditRequestEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "ms-clients",
        path = "/api/v1/clients",
        configuration = FeignClientConfig.class)
public interface ClientsFeignClient {

    @GetMapping("/findClientByrut/{rut}")
    ClientEntity findClientByrut(@PathVariable String rut);
}
