package com.pfe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.models.Citizen;
import com.pfe.services.ICitizenService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200", "https://frontend-citoyen.herokuapp.com" })
public class CitizenController {
	@Autowired
	private ICitizenService citizenservice;

	@PostMapping("/citizen/register")
	private Citizen createCitizen() {
		return citizenservice.createCitizen();
	}
}
