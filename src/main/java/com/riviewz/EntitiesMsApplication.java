package com.riviewz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EntitiesMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntitiesMsApplication.class, args);
	}
}
