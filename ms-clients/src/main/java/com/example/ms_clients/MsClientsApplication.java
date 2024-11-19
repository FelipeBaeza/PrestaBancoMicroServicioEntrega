package com.example.ms_clients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class MsClientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsClientsApplication.class, args);
	}

}
