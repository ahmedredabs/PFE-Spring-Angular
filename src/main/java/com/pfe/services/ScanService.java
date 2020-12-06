package com.pfe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.models.Scan;
import com.pfe.repositories.ScanRepository;

@Service
public class ScanService implements IScanService {

    @Autowired
    private ScanRepository scanRepository;

    @Override
    public Scan createScan(Scan scan) {
        return scanRepository.save(scan);
    }
}
