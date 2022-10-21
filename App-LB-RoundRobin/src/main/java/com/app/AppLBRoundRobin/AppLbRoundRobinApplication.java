package com.app.AppLBRoundRobin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppLbRoundRobinApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppLbRoundRobinApplication.class, args);
	}

}
