package com.codehub.springexamples;

import com.codehub.springexamples.vehicle.Car;
import com.codehub.springexamples.vehicle.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExamplesApplication.class, args);

        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");

        AutowiredInjectedTravel autowiredInjectedTravel = (AutowiredInjectedTravel) ctx.getBean("autowiredInjectedTravel");
        autowiredInjectedTravel.startJourney();

        ConstructorInjectedTravel constructorInjectedTravel = (ConstructorInjectedTravel) ctx.getBean("constructorInjectedTravel");
        constructorInjectedTravel.startJourney();

        SetterInjectedTravel setterInjectedTravel = (SetterInjectedTravel) ctx.getBean("setterInjectedTravel");
        setterInjectedTravel.startJourney();
    }
}
