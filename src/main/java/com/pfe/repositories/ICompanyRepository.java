package com.pfe.repositories;

import com.pfe.models.Company;
import org.springframework.data.repository.CrudRepository;

public interface ICompanyRepository extends CrudRepository<Company, Long> {


}