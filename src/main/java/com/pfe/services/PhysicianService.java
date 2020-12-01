package com.pfe.services;

import com.pfe.models.Physician;
import com.pfe.repositories.IPhysicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhysicianService implements IPhysicianService {

    @Autowired
    private IPhysicianRepository physicianRepository;

    @Override
    public void createPhysician(Physician newPhysician) {
        physicianRepository.save(newPhysician);
    }

}
