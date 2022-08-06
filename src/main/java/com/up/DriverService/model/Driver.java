package com.up.DriverService.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "driver_id")
    public Integer driverId;

    @Column(name = "driver_name")
    public String driverName;

    @Column(name = "identification")
    public String identification;

    @Column(name = "phone_number")
    public String phoneNumber;

    @Column(name = "balance")
    public Long balance;

    @Column(name = "ride_count")
    public int ride_count;

    @Column(name = "taxi_id")
    public int taxi_id;

    @Column(name = "driver_lat")
    public double driver_lat;

    @Column(name = "driver_lng")
    public double driver_lng;

    public Driver() {
    }

    public Driver(Integer driverId, String driverName, String identification, String phoneNumber, Long balance, int ride_count, int taxi_id, double driver_lat, double driver_lng) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.identification = identification;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.ride_count = ride_count;
        this.taxi_id = taxi_id;
        this.driver_lat = driver_lat;
        this.driver_lng = driver_lng;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getIdentification() {
        return identification;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Long getBalance() {
        return balance;
    }

    public int getRide_count() {
        return ride_count;
    }

    public int getTaxi_id() {
        return taxi_id;
    }

    public double getDriver_lat() {
        return driver_lat;
    }

    public double getDriver_lng() {
        return driver_lng;
    }
}
