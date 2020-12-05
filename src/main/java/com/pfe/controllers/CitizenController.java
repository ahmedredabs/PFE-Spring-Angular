package com.pfe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.models.Citizen;
import com.pfe.services.ICitizenService;

@RestController
public class CitizenController {
	@Autowired
	private ICitizenService citizenservice;

	@GetMapping("/citizen/register")
	private Citizen createCitizen(Citizen citizen) {
		return citizenservice.createCitizen();
	}
}
