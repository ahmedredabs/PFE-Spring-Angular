package com.pfe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.models.Citizen;
import com.pfe.repositories.CitizenRepository;

@RestController
@CrossOrigin(origins = { "http://localhost:4200", "https://frontend-citoyen.herokuapp.com" })
public class CitizenController {
	@Autowired
	private CitizenRepository citizenRepository;

	@GetMapping("/citizen/register")
	private Citizen createCitizen() {
		Citizen citizen = new Citizen(false);
		citizenRepository.save(citizen);
		return citizen;
	}
}
