package com.pfe.controllers;

import com.pfe.models.Location;
import com.pfe.models.Qrcode;
import com.pfe.services.ILocationService;
import com.pfe.services.IQRCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pfe.models.Establishment;
import com.pfe.services.IEstablishmentService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class CompanyController {

    @Autowired
    private IEstablishmentService establishmentService;
    @Autowired
    private IQRCodeService qrCodeService;
    @Autowired
    private ILocationService locationService;

    @PostMapping("/establishment/register")
    private Establishment createCompany(@RequestBody Establishment establishment) {
        return establishmentService.createCompany(establishment);
    }

    @PostMapping("/establishment/login")
    private Establishment loginCompany(@RequestBody Establishment establishment) {
        return establishmentService.login(establishment);
    }

    @PostMapping("/establishment/qrcode")
    private Qrcode generateQRCode(@RequestBody Qrcode qrCode) {
        System.out.println(qrCode.toString());
        return qrCodeService.createQRCode(qrCode);
    }

    @PostMapping("/establishment/location")
    private Location createLocation(@RequestBody Location location) {
        System.out.println(location.toString());
        return locationService.createLocation(location);
    }

}
