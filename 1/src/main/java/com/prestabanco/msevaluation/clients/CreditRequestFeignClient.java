package com.prestabanco.msevaluation.clients;

import com.prestabanco.msevaluation.configurations.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "ms-request", path = "/api/v1/request", configuration = {FeignClientConfig.class})
public interface CreditRequestFeignClient {

    @PutMapping("/EditStatus/{id}/{state}")
    String editStatus(@PathVariable String state, @PathVariable Long id);
}