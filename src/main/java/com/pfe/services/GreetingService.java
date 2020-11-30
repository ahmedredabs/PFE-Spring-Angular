package com.pfe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.models.Greeting;
import com.pfe.repositories.GreetingRepository;

//pas encore utilise a voir...
@Service
public class GreetingService implements IGreetingService{

	@Autowired
	private GreetingRepository repository;
	
	@Override
	public List<Greeting> findAll() {
		List<Greeting> greetings = (List<Greeting>) repository.findAll();
		return greetings;
	}
}
