package com.pfe.repositories;

import com.pfe.models.Establishment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Establishment, Long> {

    @Query("select c from Establishment c where c.name=:name")
    Establishment findByName(String name);

    Establishment findById(long id);

}
