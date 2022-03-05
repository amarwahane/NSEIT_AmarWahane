package com.example.customerserive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.customerservice")
@EnableFeignClients("com.examples.customerservice")
@EnableEurekaClient
public class CustomerseriveApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerseriveApplication.class, args);
	}

}
