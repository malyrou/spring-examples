package com.codehub.springexamples.travel;

import com.codehub.springexamples.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedTravel {

    //This is the dependency
    private Vehicle vehicle;

    //I'm injecting the dependency with through the constructor
    @Autowired
    public ConstructorInjectedTravel(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Using Constructor Injection");
    }

    public void startJourney() {
        vehicle.start();
    }

}

