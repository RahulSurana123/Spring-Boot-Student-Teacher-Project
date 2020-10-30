package com.mavenir.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableEurekaClient
public class SchoolApplication {

	@Bean
	public WebClient.Builder getBuilder(){
		return WebClient.builder();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

}
