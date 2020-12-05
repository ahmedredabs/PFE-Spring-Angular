package com.pfe.services;

import com.pfe.models.Establishment;
import com.pfe.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EstablishmentService implements IEstablishmentService {

    @Autowired
    private CompanyRepository CompanyRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public Establishment createCompany(Establishment newEstablishment) {
        newEstablishment.setPassword(encoder.encode(newEstablishment.getPassword()));
        return CompanyRepository.save(newEstablishment);
    }

    @Override
    public Establishment login(Establishment establishment) {
        Establishment establishmentInDb = CompanyRepository.findByName(establishment.getName());
        if(encoder.matches(establishment.getPassword(), establishmentInDb.getPassword())){
            return establishmentInDb;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Establishment findEstablishment(long id) {
        return CompanyRepository.findById(id);
    }

}
