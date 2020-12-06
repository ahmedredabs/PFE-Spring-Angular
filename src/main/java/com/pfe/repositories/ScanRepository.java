package com.pfe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pfe.models.Scan;

public interface ScanRepository extends CrudRepository<Scan,Long> {
}
