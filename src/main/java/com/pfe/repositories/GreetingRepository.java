package com.pfe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.pfe.models.Greeting;

public interface GreetingRepository extends CrudRepository<Greeting, Long>{

}
