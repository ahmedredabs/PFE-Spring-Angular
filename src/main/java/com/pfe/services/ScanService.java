package com.pfe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.models.Citizen;
import com.pfe.models.Scan;
import com.pfe.repositories.CitizenRepository;
import com.pfe.repositories.ScanRepository;

@Service
public class ScanService implements IScanService {

    @Autowired
    private ScanRepository scanRepository;
    
    @Autowired
    private CitizenRepository citizenRepository;

    @Override
    public Scan createVisitScan(Scan scan) {
        return scanRepository.save(scan);
    }
    
    @Override
    public Scan createAlertScan(Scan scan) {
    	Scan scanInsere = scanRepository.save(scan);
    	List<Scan> listOfUsersToAlert= scanRepository.findScansByCitizenId(scan.getCitizen().getId());
    	System.out.println("id utilise: "+ scan.getCitizen().getId());
    	System.out.println("la liste des users a alerter: " + listOfUsersToAlert.toString());
    	for(Scan scanOfUserToAlert:listOfUsersToAlert) {
    		Citizen citizenToAlert = citizenRepository.findById(scanOfUserToAlert.getCitizen().getId()).get();
    		System.out.println("un user a alert:" + citizenToAlert);
    		citizenToAlert.setAlerted(true);
    		citizenRepository.save(citizenToAlert);
    	}
        return scanInsere;
    }
}
