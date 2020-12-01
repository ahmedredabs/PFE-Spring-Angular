package com.pfe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pfe.models.Citizen;

@Repository
public interface CitizenRepository extends CrudRepository<Citizen, Long> {

}
