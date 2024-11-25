package com.example.ms_requestTracking.clients;

import com.example.ms_requestTracking.configurations.FeignClientConfig;
import com.example.ms_requestTracking.entities.ClientEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "ms-clients",
        path = "/api/v1/clients",
        configuration = FeignClientConfig.class)
public interface ClientsFeignClient {

    @GetMapping("/findClientByrut/{rut}")
    ClientEntity findClientByrut(@PathVariable String rut);
}
