package com.pfe.repositories;

import com.pfe.models.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ICompanyRepository extends CrudRepository<Company, Long> {

    @Query("select c from Company c where c.name=:name")
    Company findByName(String name);

}
