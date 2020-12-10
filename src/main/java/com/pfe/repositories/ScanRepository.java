package com.pfe.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pfe.models.Scan;

public interface ScanRepository extends CrudRepository<Scan, Long> {

	@Query(value = "SELECT * FROM SCANS WHERE CITIZEN_ID=?1 AND CURRENT_DATE <= SCAN_DATE + interval '10' day", nativeQuery = true)
	List<Scan> findScansByCitizenId(long contaminedCitizenId);

	@Query(value = "SELECT * FROM SCANS WHERE QR_CODE_id=?1 AND CURRENT_DATE <= SCAN_DATE + interval '10' day", nativeQuery = true)
	List<Scan> findScansByQRId(long qrId);
}
