package com.ritesh.micrometer.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMicrometerApplication {

	@GetMapping("/message")
	public String getmessage() {
		return "Work in progress....";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicrometerApplication.class, args);
	}

}
