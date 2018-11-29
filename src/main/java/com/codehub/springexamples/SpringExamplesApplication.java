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

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Vehicle vehicle = context.getBean("car", Car.class);
        vehicle.start();

    }
}
