package com.example.ms_requestTracking.clients;

import com.example.ms_requestTracking.configurations.FeignClientConfig;
import com.example.ms_requestTracking.entities.CreditRequestEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-creditRequest",
        path = "/api/v1/creditRequest",
        configuration = FeignClientConfig.class)
public interface CreditRequestFeignClient {


    @GetMapping("/findRequestById/{id}")
    CreditRequestEntity findRequestById(@PathVariable Long id);


}
