package com.example.ms_simulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class MsSimulationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSimulationApplication.class, args);
	}

}
