package com.survey.inputservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication

public class InputServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InputServiceApplication.class, args);
	}

}
