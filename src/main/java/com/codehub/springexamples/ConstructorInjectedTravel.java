package com.codehub.springexamples;

import com.codehub.springexamples.vehicle.Vehicle;

public class ConstructorInjectedTravel {

    private Vehicle myVehicle;

    //I'm injecting the dependency with through the constructor
    public ConstructorInjectedTravel(Vehicle myVehicle) {
        this.myVehicle = myVehicle;
    }

    public void startJourney() {
        myVehicle.start();
    }


}
