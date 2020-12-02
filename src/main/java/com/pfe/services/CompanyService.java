package com.pfe.services;

import com.pfe.models.Company;
import com.pfe.repositories.ICompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CompanyService implements ICompanyService {

    @Autowired
    private ICompanyRepository CompanyRepository;

    @Override
    public void createCompany(Company newCompany) {
        CompanyRepository.save(newCompany);
        System.out.println("Tout c'est bien passé");
    }
}
