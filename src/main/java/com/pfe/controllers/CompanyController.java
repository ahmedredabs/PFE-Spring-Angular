package com.pfe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.models.Company;
import com.pfe.services.ICompanyService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class CompanyController {

	@Autowired
	private ICompanyService companyService;

	@PostMapping("/company/register")
	private void createCompany(@RequestBody Company company) {
		companyService.createCompany(company);
	}

	@PostMapping("/company/login")
	private void loginCompany(@RequestBody Company company) {
		companyService.login(company);
	}

}
