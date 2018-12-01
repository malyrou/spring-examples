package com.codehub.springexamples.vehicle;

import org.springframework.beans.factory.annotation.Autowired;

import com.codehub.springexamples.engine.Engine;

public class Car implements Vehicle {

    //spring is going to autowire this by name, since there is two Engine beans defined in VehicleConfig;
    @Autowired
    private Engine gasolineEngine;

    private String plateNumber;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void start() {
        System.out.println("Travel by Car");
        gasolineEngine.start();
    }


}
