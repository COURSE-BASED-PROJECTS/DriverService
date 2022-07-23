package com.up.DriverService.service;

import com.up.DriverService.model.Driver;
import com.up.DriverService.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {
    private DriverRepository driverRepository;

    @Autowired
    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public List<Driver> findAll() {
        return driverRepository.findAll();
    }
    public Driver addNew(Driver driver) {
        return driverRepository.save(driver);
    }

    public Driver update(Driver driver) {
        return driverRepository.save(driver);
    }

    public Optional<Driver> findByDriverId(Integer driverId) {
        return driverRepository.findById(driverId);
    }
}
