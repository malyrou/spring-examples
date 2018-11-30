package com.codehub.springexamples.travel;

import com.codehub.springexamples.vehicle.Vehicle;

public class SetterInjectedTravel {

    //This is the dependency
    private Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Using Setter Injection");
    }

    public void startJourney() {
        vehicle.start();
    }


}

