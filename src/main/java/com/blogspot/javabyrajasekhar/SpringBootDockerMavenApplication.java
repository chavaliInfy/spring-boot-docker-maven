package com.blogspot.javabyrajasekhar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerMavenApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Welcome to spring boot docker maven";
	}
}
