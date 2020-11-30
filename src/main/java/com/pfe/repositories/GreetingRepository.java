package com.pfe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pfe.models.Greeting;

@Repository
public interface GreetingRepository extends CrudRepository<Greeting, Long>{

}
