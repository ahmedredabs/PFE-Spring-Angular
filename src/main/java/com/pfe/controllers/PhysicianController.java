package com.pfe.controllers;

import com.pfe.models.Physician;
import com.pfe.services.IPhysicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhysicianController {

    @Autowired
    private IPhysicianService physicianService;

    @PostMapping("/physician/register")
    private void createPhysician(@RequestBody Physician physician){
        physicianService.createPhysician(physician);
    }

}