package com.codehub.springexamples.travel;

import com.codehub.springexamples.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedTravel {

    //This is the dependency
    private Vehicle vehicle;

    @Autowired
    public ConstructorInjectedTravel(@Qualifier("car") Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Using Constructor Injection");
    }

    public void startJourney() {
        vehicle.start();
    }

}

