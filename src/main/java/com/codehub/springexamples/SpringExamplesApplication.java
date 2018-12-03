package com.codehub.springexamples;

import com.codehub.springexamples.vehicle.Bike;
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

        Vehicle carBean = context.getBean("car", Car.class);
        Vehicle anotherCarBean = context.getBean("car", Car.class);

        //check equality
        boolean singletonsCheckResult = (carBean == anotherCarBean);
        System.out.println("Pointing to the same location: " + singletonsCheckResult);
        System.out.println("Object location of carBean " + carBean);
        System.out.println("Object location of anotherCarBean " + anotherCarBean);

        //retrieve bean from spring container
        Vehicle bikeBean = context.getBean("bike", Vehicle.class);

        //retrieve the same bean and assign to a different object
        Vehicle anotherBikeBean = context.getBean("bike", Vehicle.class);

        //check equality
        boolean prototypeCheckResult = (bikeBean == anotherBikeBean);
        System.out.println("Pointing to the same location: " + prototypeCheckResult);
        System.out.println("Object location of bikeBean " + bikeBean);
        System.out.println("Object location of anotherBikeBean " + anotherBikeBean);

        //call methods on the bean
        carBean.start();
        anotherCarBean.start();

        bikeBean.start();
        anotherBikeBean.start();

    }
}
