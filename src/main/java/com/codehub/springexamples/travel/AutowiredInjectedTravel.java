package com.codehub.springexamples.travel;

import com.codehub.springexamples.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredInjectedTravel {

    //This is the dependency
    //No setter or constructor is needed
    //We need this annotation here to know where to Autowire
    @Autowired
    private Vehicle vehicle;

    public void startJourney() {
        vehicle.start();
    }

}


