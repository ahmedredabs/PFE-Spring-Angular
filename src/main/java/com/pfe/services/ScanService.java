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
		List<Scan> listOfLocationsVisited = scanRepository.findScansByCitizenId(scan.getCitizen().getId());
		for (Scan locationVisited : listOfLocationsVisited) {
			List<Scan> locationsVisited = scanRepository.findScansByQRId(locationVisited.getQrCode().getId());
			for (Scan scan1 : locationsVisited) {
				Citizen citizenToAlert = citizenRepository.findById(scan1.getCitizen().getId()).get();
				citizenToAlert.setAlerted(true);
				citizenRepository.save(citizenToAlert);
			}
		}
		return scanInsere;
	}
}
