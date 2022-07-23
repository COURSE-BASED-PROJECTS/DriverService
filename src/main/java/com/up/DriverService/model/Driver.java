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

    public Driver() {
    }

    public Driver(Integer driverId, String driverName, String identification, String phoneNumber) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.identification = identification;
        this.phoneNumber = phoneNumber;
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
}
