package com.up.DriverService.model;

public class Taxi {

    public Integer taxiId;

    public String taxiName;

    public String plate;

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

    @Override
    public String toString() {
        return "Taxi{" +
                "taxiId=" + taxiId +
                ", taxiName='" + taxiName + '\'' +
                ", plate='" + plate + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }
}
