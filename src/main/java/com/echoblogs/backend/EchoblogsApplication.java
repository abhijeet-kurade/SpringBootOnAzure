package com.echoblogs.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EchoblogsApplication {

	@GetMapping("/message")
	public String message(){
		return "This is a Spring Boot app by Abhijeet Kurade!!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(EchoblogsApplication.class, args);
	}

}
