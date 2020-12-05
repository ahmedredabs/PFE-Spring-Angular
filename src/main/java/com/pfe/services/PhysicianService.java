package com.pfe.services;

import com.pfe.models.Physician;
import com.pfe.repositories.PhysicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhysicianService implements IPhysicianService {

    @Autowired
    private PhysicianRepository physicianRepository;

    @Override
    public Physician createPhysician(Physician newPhysician) {
        return physicianRepository.save(newPhysician);
    }

}
