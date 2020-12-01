package com.pfe.services;

import com.pfe.models.Company;
import com.pfe.repositories.ICompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CompanyService implements ICompanyRepository {

    @Autowired
    private ICompanyRepository repository;

    @Override
    Company createCompany() {
        return null;
    }

}
