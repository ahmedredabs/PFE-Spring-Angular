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
    
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public Physician createPhysician(Physician newPhysician) {
        newPhysician.setPassword(encoder.encode(newPhysician.getPassword()));
    	return physicianRepository.save(newPhysician);
    }
    
    @Override
    public Physician loginPhysician(Physician physician) {
    	Physician physicianInDB = physicianRepository.findByName(physician.getName());
    	if(encoder.matches(physician.getPassword(), physicianInDB.getPassword())) {
    		return physicianInDB;
    	}
    	return null;
    }

}
