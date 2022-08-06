package com.up.DriverService.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "taxis")
public class Taxi {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    public Integer taxiId;

    @Column(name="TaxiName")
    public String taxiName;

    @Column(name="Plate")
    public String plate;

    @Column(name="CarType")
    public String carType;

    public Taxi(Integer taxiId, String taxiName, String plate, String carType) {
        this.taxiId = taxiId;
        this.taxiName = taxiName;
        this.plate = plate;
        this.carType = carType;
    }

    public Taxi() {
    }

    public Integer getTaxiId() {
        return taxiId;
    }

    public String getTaxiName() {
        return taxiName;
    }

    public String getPlate() {
        return plate;
    }

    public String getCarType() {
        return carType;
    }
}
