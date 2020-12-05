package com.pfe.services;

import com.pfe.models.Physician;

public interface IPhysicianService {
    void createPhysician(Physician physician);
    
    boolean loginPhysician(Physician physician);
}
