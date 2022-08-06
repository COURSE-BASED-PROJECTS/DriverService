package com.up.DriverService.service;

import com.up.DriverService.dto.DriverDto;
import com.up.DriverService.model.Driver;
import com.up.DriverService.model.Taxi;
import com.up.DriverService.repository.DriverRepository;
import com.up.DriverService.repository.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {
    private DriverRepository driverRepository;

    private TaxiRepository taxiRepository;

    @Autowired
    public DriverService(DriverRepository driverRepository, TaxiRepository taxiRepository) {
        this.driverRepository = driverRepository;
        this.taxiRepository = taxiRepository;
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

    public Optional<DriverDto> getDriverInfoByPhoneNumber(String phone_number) {
        Driver d = driverRepository.findByPhoneNumber(phone_number);

        Optional<Taxi> driverCar = taxiRepository.findByTaxiId(d.getTaxi_id());

        DriverDto rs = new DriverDto(d.getDriverName(), driverCar.get().getPlate(), driverCar.get().getCarType() , d.getBalance(), d.getRide_count());

        return Optional.of(rs);
    }
}
