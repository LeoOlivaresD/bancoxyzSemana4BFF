package com.duoc.bancoxyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BancoxyzApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoxyzApplication.class, args);
	}

}
