package com.codehub.springexamples;

import com.codehub.springexamples.config.VehicleConfig;
import com.codehub.springexamples.vehicle.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExamplesApplication.class, args);

        //load application context
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(VehicleConfig.class);
        //retrieve bean from spring container, scanned from VehicleConfig
        Vehicle vehicle = ctx.getBean("bikeVehicle", Vehicle.class);

        vehicle.start();

    }
}
