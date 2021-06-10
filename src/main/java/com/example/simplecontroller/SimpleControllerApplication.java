package com.example.simplecontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleControllerApplication {

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "Hello " + name;
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleControllerApplication.class, args);
	}

}
