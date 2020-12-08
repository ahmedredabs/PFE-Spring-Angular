package com.pfe.controllers;

import com.pfe.models.Physician;
import com.pfe.models.Qrcode;
import com.pfe.services.IPhysicianService;
import com.pfe.services.IQRCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhysicianController {

    @Autowired
    private IPhysicianService physicianService;
    @Autowired
    private IQRCodeService qrCodeService;
    
    @PostMapping("/physician/register")
    private void createPhysician(@RequestBody Physician physician){
        physicianService.createPhysician(physician);
    }

    @PostMapping("/physician/login")
    private Physician loginPhysician(@RequestBody Physician physician){
        return physicianService.loginPhysician(physician);
    }
    @PostMapping("/physician/qrcode")
    private Qrcode generateQRCode(@RequestBody Qrcode qrcode) {
        System.out.println(qrcode.toString());
        return qrCodeService.createQRCode(qrcode);
    }
    
}