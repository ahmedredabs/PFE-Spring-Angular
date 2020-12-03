package com.pfe.services;

import com.pfe.models.Company;
import com.pfe.repositories.ICompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Override
    public boolean login(Company company) {
        Company companyInDb = CompanyRepository.findByName(company.getName());
        if(encoder.matches(company.getPassword(), companyInDb.getPassword())){
            System.out.println("Login DONE");
            return true;
        }
        return false;
    }
}
