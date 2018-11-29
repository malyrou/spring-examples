package com.codehub.springexamples.config;

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


    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Vehicle bikeVehicle() {
        return new Bike();
    }

}
