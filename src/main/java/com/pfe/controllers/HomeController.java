package com.pfe.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.models.Greeting;
import com.pfe.models.GreetingRepository;

@RestController
@RequestMapping("/")
public class HomeController {
	private GreetingRepository greetingRepository;
	
	@GetMapping
	private String HomeMessage() {
		return "Welcome to the website!";
	}
	
	@GetMapping("/greetings")
	private Iterable<Greeting> greetings(){
		return greetingRepository.findAll();
	}
}
