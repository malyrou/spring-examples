package com.codehub.springexamples.config;

import com.codehub.springexamples.vehicle.Bike;
import com.codehub.springexamples.vehicle.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    //    Bean declaration
    @Bean(name = "bike")
    public Bike getBike() {
        return new Bike();
    }

    //    Bean declaration
    @Bean(name = "car")
    public Car getCar() {
        Car car = new Car();
        car.setPlateNumber("ZHI-6344");
        return car;
    }

//    //    Setter Injection
//    @Bean(name = "setterInjectedTravel")
//    public SetterInjectedTravel getSetterInjectedTravel() {
//        SetterInjectedTravel setterInjectedTravel = new SetterInjectedTravel();
//        setterInjectedTravel.setVehicle(getBike());
//        return setterInjectedTravel;
//    }
//
//    //    Constructor Injection
//    @Bean(name = "constructorInjectedTravel")
//    public ConstructorInjectedTravel getCustomerService() {
//        ConstructorInjectedTravel constructorInjectedTravel = new ConstructorInjectedTravel(getBike());
//        return constructorInjectedTravel;
//    }
//
//    //    Use autowire with this bean, the same with bean declaration
//    @Bean(name = "autowiredInjectedTravel")
//    public AutowiredInjectedTravel getAutowiredInjectedTravel() {
//        return new AutowiredInjectedTravel();
//    }

}

