package com.up.DriverService.controller;

import com.up.DriverService.dto.DriverDto;
import com.up.DriverService.model.Driver;
import com.up.DriverService.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/driver")
public class DriverController {

    private DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }
    @GetMapping
    public ResponseEntity<List<Driver>> getAllDriver(){
        return new ResponseEntity<>(driverService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Driver>> getDriverById(@PathVariable("id") Integer taxiId){
        return new ResponseEntity<>(driverService.findByDriverId(taxiId), HttpStatus.OK);
    }

    @GetMapping("/name/{id}")
    public ResponseEntity<String> getDriverNameById(@PathVariable("id") Integer taxiId){
        return new ResponseEntity<>(driverService.findNameByDriverId(taxiId), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Driver> addNewDriver(@RequestBody Driver driver){
        return new ResponseEntity<>(driverService.addNew(driver), HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<Driver> updateDriver(@RequestBody Driver driver){
        return new ResponseEntity<>(driverService.update(driver), HttpStatus.OK);
    }

    @GetMapping("/info/{phone_number}")
    public ResponseEntity<Optional<DriverDto>> getInfoDriver(@PathVariable("phone_number") String phone_number){
        return new ResponseEntity<>(driverService.getDriverInfoByPhoneNumber(phone_number), HttpStatus.OK);
    }
}
