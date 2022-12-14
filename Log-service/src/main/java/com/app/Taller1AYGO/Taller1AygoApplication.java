package com.app.Taller1AYGO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Taller1AygoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Taller1AygoApplication.class, args);
	}

}
