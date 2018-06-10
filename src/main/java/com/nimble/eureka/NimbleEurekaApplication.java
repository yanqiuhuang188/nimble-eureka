package com.nimble.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka server
 */
@SpringBootApplication
@EnableEurekaServer
public class NimbleEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NimbleEurekaApplication.class, args);
	}
}

