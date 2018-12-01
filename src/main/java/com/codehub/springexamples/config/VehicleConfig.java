package com.codehub.springexamples.config;

import com.codehub.springexamples.engine.DieselEngine;
import com.codehub.springexamples.engine.Engine;
import com.codehub.springexamples.engine.GasolineEngine;
import com.codehub.springexamples.vehicle.Bike;
import com.codehub.springexamples.vehicle.Car;
import com.codehub.springexamples.vehicle.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfig {

    @Bean
    public Vehicle carVehicle() {
        return new Car();
    }

    @Bean
    public Vehicle bikeVehicle() {
        return new Bike();
    }

    @Bean
    public Engine dieselEngine() {return new DieselEngine();}

    @Bean
    public Engine gasolineEngine() {
        return new GasolineEngine();
    }

}
