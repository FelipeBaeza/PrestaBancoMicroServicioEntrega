package com.prestabanco.mstotalcost.clients;

import com.prestabanco.mstotalcost.configurations.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-simulation",
        path = "/api/v1/simulation",
        configuration = FeignClientConfig.class)
public interface SimulationFeignClient {

    @GetMapping("/calculate/{amount}/{interestRate}/{term}")
    int simulation(@PathVariable int amount, @PathVariable double interestRate, @PathVariable int term);
}
