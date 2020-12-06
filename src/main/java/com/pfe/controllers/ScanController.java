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
	
	@PostMapping("/scan/scanner")
    private void createScan(@RequestBody Scan scan){
		System.out.println("TEST : "+scan.toString());
		scanService.createScan(scan);
    }
    
}