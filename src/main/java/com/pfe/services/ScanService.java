package com.pfe.services;

import com.pfe.models.Scan;
import com.pfe.repositories.ScanRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ScanService implements IScanService {

    @Autowired
    private ScanRepository scanRepository;

    @Override
    public Scan createScan(Scan scan) {
        return scanRepository.save(scan);
    }
}
