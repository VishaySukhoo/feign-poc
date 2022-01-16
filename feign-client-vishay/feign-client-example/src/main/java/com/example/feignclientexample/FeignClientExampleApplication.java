package com.example.feignclientexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //register as client on eureka server
@EnableFeignClients
public class FeignClientExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientExampleApplication.class, args);
	}

}
