package com.pfe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.models.Scan;
import com.pfe.services.IScanService;

@RestController
public class ScanController {
	
	@Autowired
    private IScanService scanService;
	
	@PostMapping("/scan/visitScan")
    private void createVisitScan(@RequestBody Scan scan){
		scanService.createVisitScan(scan);
    }
	
	@PostMapping("/scan/alertScan")
    private void createAlertScan(@RequestBody Scan scan){
		scanService.createAlertScan(scan);
    }
    
}