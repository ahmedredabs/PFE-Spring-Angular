package com.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.models.Greeting;
import com.pfe.repositories.GreetingRepository;
import com.pfe.services.IGreetingService;

@RestController
@RequestMapping("/")
public class HomeController {
	@Autowired
	private GreetingRepository greetingService;
	
	@GetMapping
	private String HomeMessage() {
		return "Welcome to the website!";
	}
	
	@GetMapping("/greetings")
	private Iterable<Greeting> greetings(){
		return greetingService.findAll();
	}
}
