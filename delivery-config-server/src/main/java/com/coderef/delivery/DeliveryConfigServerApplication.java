package com.coderef.delivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DeliveryConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryConfigServerApplication.class, args);
	}
}
