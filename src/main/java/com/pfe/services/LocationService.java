package com.pfe.services;

import com.pfe.models.Location;
import com.pfe.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService implements ILocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location createLocation(Location location) {
        System.out.println("Je passe dans l'impl du service");
        return locationRepository.save(location);
    }
}
