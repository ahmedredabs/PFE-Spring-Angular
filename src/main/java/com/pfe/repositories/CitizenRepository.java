package com.pfe.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pfe.models.Citizen;
import com.pfe.models.Scan;

@Repository
public interface CitizenRepository extends CrudRepository<Citizen, Long> {
	
	/**@Query(value = "UPDATE scans SET is_alerted = true WHERE id=?1",nativeQuery=true)
	List<Scan> updateAlertUser(long citizenToAlertId);*/
}
