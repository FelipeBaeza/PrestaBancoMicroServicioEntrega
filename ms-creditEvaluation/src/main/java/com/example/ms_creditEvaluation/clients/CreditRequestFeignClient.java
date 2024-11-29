package com.example.ms_creditEvaluation.clients;

import com.example.ms_creditEvaluation.configurations.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "ms-creditRequest",
        path = "/api/v1/creditRequest",
        configuration = FeignClientConfig.class)
public interface CreditRequestFeignClient {

    @PutMapping("/EditStatus/{id}/{state}")
    String editStatus(@PathVariable String state, @PathVariable Long id);
}
