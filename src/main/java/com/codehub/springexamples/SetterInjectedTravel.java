package com.codehub.springexamples;

import com.codehub.springexamples.vehicle.Car;
import com.codehub.springexamples.vehicle.Vehicle;

public class SetterInjectedTravel {

    //This is the dependency
    private Vehicle myVehicle;

    //I'm injecting the dependency with a setter
    public void setVehicle(Vehicle givenVehicle) {
        myVehicle = givenVehicle;
    }

    public void startJourney() {
        myVehicle.start();
    }


}
