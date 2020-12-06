package com.pfe.services;

import com.pfe.models.Physician;
import com.pfe.repositories.PhysicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PhysicianService implements IPhysicianService {

    @Autowired
    private PhysicianRepository physicianRepository;
    
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);

    @Override
    public Physician createPhysician(Physician newPhysician) {
        return physicianRepository.save(newPhysician);
    }
    
    @Override
    public boolean loginPhysician(Physician physician) {
    	Physician phycisianInDB = physicianRepository.findByName(physician.getName());
    	return encoder.matches(physician.getPassword(), phycisianInDB.getPassword());
    }

}
