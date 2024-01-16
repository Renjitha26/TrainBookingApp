package com.irctc.trainbookingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.irctc.trainbookingsystem.*")
@EntityScan
@EnableJpaRepositories
public class TrainbookingsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainbookingsystemApplication.class, args);
	}

}
