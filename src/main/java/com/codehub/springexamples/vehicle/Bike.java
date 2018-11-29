package com.codehub.springexamples.vehicle;

public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Travel by Bike");
    }

    public void initMethod() {
        System.out.println("Inside Bike's Init Method");
    }

    public void destroyMethod() {
        System.out.println("Inside Bike's Destroy Method");
    }


}
