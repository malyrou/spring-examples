package com.codehub.springexamples.config;

import com.codehub.springexamples.travel.AutowiredInjectedTravel;
import com.codehub.springexamples.travel.ConstructorInjectedTravel;
import com.codehub.springexamples.travel.SetterInjectedTravel;
import com.codehub.springexamples.vehicle.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    //    Bean declaration
    @Bean(name = "bike")
    public Bike getBike() {
        return new Bike();
    }

//    @Bean(name = "car")
//    public Car getCar() {
//        return new Car();
//    }

    //    Setter Injection
    @Bean(name = "setterInjectedTravel")
    public SetterInjectedTravel getSetterInjectedTravel() {
        SetterInjectedTravel setterInjectedTravel = new SetterInjectedTravel();
        setterInjectedTravel.setVehicle(getBike());
        return setterInjectedTravel;
    }

    //    Constructor Injection
    @Bean(name = "constructorInjectedTravel")
    public ConstructorInjectedTravel getCustomerService() {
        ConstructorInjectedTravel constructorInjectedTravel = new ConstructorInjectedTravel(getBike());
        return constructorInjectedTravel;
    }

    //    Use autowire with this bean, the same with bean declaration
    @Bean(name = "autowiredInjectedTravel")
    public AutowiredInjectedTravel getAutowiredInjectedTravel() {
        return new AutowiredInjectedTravel();
    }

}
