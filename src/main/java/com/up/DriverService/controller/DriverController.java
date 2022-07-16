package com.up.DriverService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/driver")
public class DriverController {
    @GetMapping
    public ResponseEntity<String> getAllAccount(){
        return new ResponseEntity<>("Hello. I'm driver service", HttpStatus.OK);
    }
}
