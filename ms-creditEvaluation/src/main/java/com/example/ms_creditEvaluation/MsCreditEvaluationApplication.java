package com.example.ms_creditEvaluation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsCreditEvaluationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCreditEvaluationApplication.class, args);
	}

}
