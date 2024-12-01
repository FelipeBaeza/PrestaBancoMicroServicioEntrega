package com.example.ms_totalCosts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsTotalCostsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsTotalCostsApplication.class, args);
	}

}
