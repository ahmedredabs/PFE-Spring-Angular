package com.pfe.repositories;

import com.pfe.models.Physician;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PhysicianRepository extends CrudRepository<Physician, Long> {

	@Query("select p from Physician p where p.name=?1")
	Physician findByName(String name);
}
