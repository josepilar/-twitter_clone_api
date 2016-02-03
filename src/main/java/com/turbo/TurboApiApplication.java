package com.turbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.turbo")
public class TurboApiApplication {	
	public static void main(String[] args) {
		SpringApplication.run(TurboApiApplication.class, args);
	}
}
