package com.pfe.controllers;

import com.pfe.models.Company;
import com.pfe.services.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class CompanyController {

    @Autowired
    private ICompanyService companyService;

    @PostMapping("/company/register")
    private void createCompany(@RequestBody Company company){
        companyService.createCompany(company);
    }

    // TODO !!!
    @PostMapping("/company/login")
    private void loginCompany(@RequestBody Company company){
        return;
    }

}
