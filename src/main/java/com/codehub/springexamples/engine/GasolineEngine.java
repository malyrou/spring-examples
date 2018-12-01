package com.codehub.springexamples.engine;

public class GasolineEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Start consuming gasoline");
    }
}
