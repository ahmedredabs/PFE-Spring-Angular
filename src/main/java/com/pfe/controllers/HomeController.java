package com.pfe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.models.Greeting;
import com.pfe.repositories.GreetingRepository;

@RestController
@CrossOrigin(origins = { "http://localhost:4200", "https://frontend-citoyen.herokuapp.com" })
public class HomeController {
	@Autowired
	private GreetingRepository greetingRepository;

	@GetMapping("/")
	private String HomeMessage() {
		return "Welcome to the website!";
	}

	@GetMapping("/greetings")
	private Iterable<Greeting> greetings() {
		return greetingRepository.findAll();
	}

	@PostMapping("/greetings")
	void addGreeting(@RequestBody Greeting greeting) {
		greetingRepository.save(greeting);
	}
}
