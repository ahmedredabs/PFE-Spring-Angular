package com.pfe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.models.Citizen;
import com.pfe.services.ICitizenService;

@RestController
public class CitizenController {
	@Autowired
	private ICitizenService citizenservice;

	@PostMapping("/citizen/register")
	private Citizen createCitizen(@RequestBody Citizen citizen) {
		return citizenservice.createCitizen(citizen);
	}
}
