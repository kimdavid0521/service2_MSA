package com.example.service2_MSA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Service2MsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Service2MsaApplication.class, args);
	}

}
