package com.codehub.springexamples.engine;

public class DieselEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Start consuming diesel");
    }
}
