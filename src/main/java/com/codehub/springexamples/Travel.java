package com.codehub.springexamples;

import com.codehub.springexamples.vehicle.Vehicle;

public class Travel {

    private Vehicle myVehicle;

    public void setV(Vehicle givenVehicle) {
        myVehicle = givenVehicle;
    }


    public void startJourney() {
        myVehicle.start();
    }



}
