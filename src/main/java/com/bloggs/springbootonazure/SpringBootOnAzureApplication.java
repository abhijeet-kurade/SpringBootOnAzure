package com.bloggs.springbootonazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootOnAzureApplication {

	@GetMapping("/message")
	public String message(){
		return "This is a Spring Boot app!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOnAzureApplication.class, args);
	}

}
