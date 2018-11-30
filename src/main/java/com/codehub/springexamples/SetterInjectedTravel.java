package com.codehub.springexamples;

import com.codehub.springexamples.vehicle.Vehicle;

public class SetterInjectedTravel {

    //This is the dependency
    private Vehicle vehicle;

    //I'm injecting the dependency with a setter
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Using Setter Injection");
    }

    public void startJourney() {
        vehicle.start();
    }

}
