package com.codehub.springexamples.vehicle;

import org.springframework.beans.factory.annotation.Autowired;

import com.codehub.springexamples.engine.Engine;

public class Bike implements Vehicle {

    //spring is going to autowire this by name, since there is two Engine beans defined in VehicleConfig;
    @Autowired
    private Engine dieselEngine;

    @Override
    public void start() {
        System.out.println("Travel by Bike");
        dieselEngine.start();
    }


}
