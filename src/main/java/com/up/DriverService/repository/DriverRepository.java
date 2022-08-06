package com.up.DriverService.repository;

import com.up.DriverService.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {

    Driver findByPhoneNumber(String phone_number);
}
