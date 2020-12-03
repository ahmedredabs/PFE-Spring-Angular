package com.pfe.services;

import com.pfe.models.Company;
import com.pfe.repositories.ICompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CompanyService implements ICompanyService {

    @Autowired
    private ICompanyRepository CompanyRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);

    @Override
    public void createCompany(Company newCompany) {
        newCompany.setPassword(encoder.encode(newCompany.getPassword()));
        CompanyRepository.save(newCompany);
        System.out.println("Tout c'est bien passé");
    }
}
