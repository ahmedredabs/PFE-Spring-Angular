package com.pfe.repositories;

import com.pfe.models.Physician;
import org.springframework.data.repository.CrudRepository;

public interface IPhysicianRepository extends CrudRepository<Physician, Long> {

}
