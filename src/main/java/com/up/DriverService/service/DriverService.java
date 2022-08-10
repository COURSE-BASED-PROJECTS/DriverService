package com.up.DriverService.service;

import com.up.DriverService.dto.DriverDto;
import com.up.DriverService.model.Driver;
import com.up.DriverService.model.Taxi;
import com.up.DriverService.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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

    public Optional<DriverDto> getDriverInfoByPhoneNumber(String phone_number) {
        Driver d = driverRepository.findByPhoneNumber(phone_number);

        String uri = "http://localhost:9090/api/taxi/" + d.getTaxi_id();
        RestTemplate restTemplate = new RestTemplate();
        Taxi driverCar = restTemplate.getForObject(uri, Taxi.class);
        //System.out.println(driverCar.toString());

        DriverDto rs = new DriverDto(d.getDriverName(), driverCar.getPlate(), driverCar.getCarType() , d.getBalance(), d.getRide_count());

        return Optional.of(rs);
    }
}
