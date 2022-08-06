package com.up.DriverService.dto;

public class DriverDto {
    public String name;
    public String plate;
    public String carType;
    public float balance;
    public int ride_count;

    public DriverDto(String name, String plate, String carType, float balance, int ride_count) {
        this.name = name;
        this.plate = plate;
        this.carType = carType;
        this.balance = balance;
        this.ride_count = ride_count;
    }

    public String getName() {
        return name;
    }

    public String getPlate() {
        return plate;
    }

    public String getCarType() {
        return carType;
    }

    public float getBalance() {
        return balance;
    }

    public int getRide_count() {
        return ride_count;
    }
}
