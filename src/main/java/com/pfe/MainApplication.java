package com.pfe;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import com.pfe.models.Greeting;
import com.pfe.repositories.GreetingRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"com.pfe.controllers","com.pfe.services","com.pfe.models","com.pfe.repositories"})
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
	
    @Bean
    CommandLineRunner init(GreetingRepository greetingRepository) {
        return args -> {
            Stream.of("salut", "bonjour", "bonsoir", "Yo!", "Hello").forEach(message -> {
                Greeting greeting = new Greeting(message);
                greetingRepository.save(greeting);
            });
            greetingRepository.findAll().forEach(System.out::println);
        };
    }

}
