package com.example.ms_requestTracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class MsRequestTrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRequestTrackingApplication.class, args);
	}

}
