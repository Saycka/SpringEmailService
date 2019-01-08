package ru.manyatkin.springEmailService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringEmailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailServiceApplication.class, args);
	}

}

