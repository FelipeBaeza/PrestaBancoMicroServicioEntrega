package com.prestabanco.mstracking.clients;

import com.prestabanco.mstracking.configurations.FeignClientConfig;
import com.prestabanco.mstracking.entities.CreditRequestEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-creditRequest",
        path = "/api/v1/creditRequest",
        configuration = FeignClientConfig.class)
public interface CreditRequestFeignClient {


    @GetMapping("/findRequestById/{id}")
    CreditRequestEntity findRequestById(@PathVariable Long id);


}