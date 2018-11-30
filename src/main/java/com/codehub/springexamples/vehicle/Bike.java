package com.codehub.springexamples.vehicle;

import org.springframework.stereotype.Component;

//This annotation is needed to tell spring that this is a bean
@Component
public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("SetterInjectedTravel by Bike");
    }


}
