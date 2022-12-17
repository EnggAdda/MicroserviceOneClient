package com.example.microserviceoneclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroserviceOneClientApplication {

	@GetMapping("/hello")
	public String get(){

		return  "microservice-one";
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceOneClientApplication.class, args);
	}

}
