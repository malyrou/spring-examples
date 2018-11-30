package com.codehub.springexamples;

import com.codehub.springexamples.vehicle.Vehicle;

public class PropertyInjectedTravel {

    //This is the dependency
    //Here I need this property to be public so the dependency can be injected
    public Vehicle myVehicle;

    public void startJourney() {
        myVehicle.start();
    }

}
