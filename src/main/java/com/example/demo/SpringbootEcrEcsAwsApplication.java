package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SpringbootEcrEcsAwsApplication {

	@GetMapping("/hello")
	String show()
	{
		return "Hello World";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootEcrEcsAwsApplication.class, args);
	}

}
