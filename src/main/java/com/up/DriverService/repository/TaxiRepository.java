package com.up.DriverService.repository;

import com.up.DriverService.model.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaxiRepository extends JpaRepository<Taxi, Integer> {
    Optional<Taxi> findByTaxiId(Integer taxiId);
}
