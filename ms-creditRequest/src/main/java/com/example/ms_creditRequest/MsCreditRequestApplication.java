package com.example.ms_creditRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class MsCreditRequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCreditRequestApplication.class, args);
	}

}
