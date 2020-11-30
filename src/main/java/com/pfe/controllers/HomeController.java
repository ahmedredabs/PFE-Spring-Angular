package com.pfe.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@GetMapping
	private String HomeMessage() {
		return "Welcome to the website!";
	}
	
	@GetMapping("example")
	private String ExempleRoute() {
		return "endpoint example";
	}
	//test
}
