package com.codehub.springexamples;

import com.codehub.springexamples.vehicle.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExamplesApplication.class, args);

        Travel myTravel = new Travel();
        myTravel.setV(new Car());
        myTravel.startJourney();


    }
}
