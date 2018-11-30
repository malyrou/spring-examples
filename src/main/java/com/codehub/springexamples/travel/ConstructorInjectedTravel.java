package com.codehub.springexamples.travel;

import com.codehub.springexamples.vehicle.Vehicle;

public class ConstructorInjectedTravel {

    //This is the dependency
    private Vehicle vehicle;

    public ConstructorInjectedTravel(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Using Constructor Injection");
    }

    public void startJourney() {
        vehicle.start();
    }


}

