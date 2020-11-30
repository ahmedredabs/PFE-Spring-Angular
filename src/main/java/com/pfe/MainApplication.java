package com.pfe;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.pfe.models.Greeting;
import com.pfe.repositories.GreetingRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"com.pfe.controllers","com.pfe.services","com.pfe.models","com.pfe.repositories"})
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
