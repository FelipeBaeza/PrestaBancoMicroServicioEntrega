package com.example.ms_totalCosts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class MsTotalCostsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsTotalCostsApplication.class, args);
	}

}
