package com.codehub.springexamples;

import com.codehub.springexamples.vehicle.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExamplesApplication.class, args);

        //Constructor Injection
        //When I instantiate the object I pass to it it's dependency (SAFE, BUT NEEDS CONSTRUCTOR)
        ConstructorInjectedTravel constructorInjectedTravel = new ConstructorInjectedTravel(new Car());
        constructorInjectedTravel.startJourney();

        //Setter Injection
        //After instantiation I use a setter method to pass the dependency (LESS SAFE, MORE CONVENIENT)
        SetterInjectedTravel setterInjectedTravel = new SetterInjectedTravel();
        setterInjectedTravel.setVehicle(new Car());
        setterInjectedTravel.startJourney();

        //Property Injection
        //After instantiation I access the property directly to pass a value (DANGEROUS, I NEED NO-PRIVATE PROPERTY)
        PropertyInjectedTravel propertyInjectedTravel = new PropertyInjectedTravel();
        propertyInjectedTravel.myVehicle = new Car();
        propertyInjectedTravel.startJourney();

    }
}
