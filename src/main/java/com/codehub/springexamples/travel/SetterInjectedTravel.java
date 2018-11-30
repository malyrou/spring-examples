package com.codehub.springexamples.travel;

import com.codehub.springexamples.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectedTravel {

    //This is the dependency
    private Vehicle vehicle;

    @Autowired
    @Qualifier("car")
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Using Setter Injection");
    }

    public void startJourney() {
        vehicle.start();
    }

}


