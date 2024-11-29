package com.example.ms_totalCosts.clients;

import com.example.ms_totalCosts.configurations.FeignClientConfig;
import com.example.ms_totalCosts.entitites.CreditRequestEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-creditRequest",
        path = "/api/v1/creditRequest",
        configuration = FeignClientConfig.class)
public interface CreditRequestFeignClient {

    @GetMapping("/findById/{id}")
    CreditRequestEntity findById(@PathVariable Long id);
}
