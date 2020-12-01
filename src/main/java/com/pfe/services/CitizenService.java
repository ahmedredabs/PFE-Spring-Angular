package com.pfe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.models.Citizen;
import com.pfe.repositories.CitizenRepository;

@Service
public class CitizenService implements ICitizenService {
	@Autowired
	private CitizenRepository citizenRepository;

	@Override
	public Citizen createCitizen() {
		Citizen citizen = new Citizen(false);
		citizenRepository.save(citizen);
		return citizen;
	}
}
