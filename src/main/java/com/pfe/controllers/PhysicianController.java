package com.pfe.controllers;

import com.pfe.models.Physician;
import com.pfe.services.IPhysicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class PhysicianController {

    @Autowired
    private IPhysicianService physicianService;
    
    @PostMapping("/physician/register")
    private void createPhysician(@RequestBody Physician physician){
        physicianService.createPhysician(physician);
        System.out.println("ajout fait");
    }

    @PostMapping("/physician/login")
    private boolean loginPhysician(@RequestBody Physician physician){
        return physicianService.loginPhysician(physician);
    }
    
}