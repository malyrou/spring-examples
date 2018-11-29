package com.codehub.springexamples.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Travel by Bike");
    }


}
