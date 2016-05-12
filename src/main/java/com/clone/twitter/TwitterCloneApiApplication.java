package com.clone.twitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.clone.twitter")
public class TwitterCloneApiApplication {	
	public static void main(String[] args) {
		SpringApplication.run(TwitterCloneApiApplication.class, args);
	}
}
