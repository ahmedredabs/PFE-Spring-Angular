package com.pfe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.models.Citizen;
import com.pfe.repositories.CitizenRepository;
import com.pfe.utils.TokenManager;

@Service
public class CitizenService implements ICitizenService {
	@Autowired
	private CitizenRepository citizenRepository;

	@Override
	public String createCitizen(Citizen citizen) {
		citizen = new Citizen(citizen.getName());
		citizenRepository.save(citizen);
		return TokenManager.generateToken(String.valueOf(citizen.getId()));
	}
}
