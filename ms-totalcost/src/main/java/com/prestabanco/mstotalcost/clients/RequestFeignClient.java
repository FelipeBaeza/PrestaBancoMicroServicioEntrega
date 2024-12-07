package com.prestabanco.mstotalcost.clients;

import com.prestabanco.mstotalcost.configurations.FeignClientConfig;
import com.prestabanco.mstotalcost.entities.CreditRequestEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "ms-request", path = "/api/v1/request", configuration = {FeignClientConfig.class})
public interface RequestFeignClient {

    @GetMapping("/findById/{id}")
    CreditRequestEntity findById(@PathVariable Long id);
}