package com.pfe.main;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.pfe.models.Greeting;
import com.pfe.models.GreetingRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"com.pfe.main","com.pfe.controllers","com.pfe.models"})
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
	
	@Bean
	ApplicationRunner applicationRunner(GreetingRepository greetingRepository) {
		return args -> {
			greetingRepository.save(new Greeting("hello"));
			greetingRepository.save(new Greeting("world"));
		};
	}

}
