package com.pfe.services;

import com.pfe.models.Company;

public interface ICompanyService {
    void createCompany(Company company);
    boolean login(Company company);
}
