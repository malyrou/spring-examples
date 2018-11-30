package com.codehub.springexamples;

import com.codehub.springexamples.travel.AutowiredInjectedTravel;
import com.codehub.springexamples.travel.ConstructorInjectedTravel;
import com.codehub.springexamples.travel.SetterInjectedTravel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//Now I need this "umbrella" annotation to tell spring to look for @Configuration annotations and other annotations
//and pick up beans and bean wiring from it
@SpringBootApplication
public class SpringExamplesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringExamplesApplication.class, args);

        AutowiredInjectedTravel autowiredInjectedTravel = (AutowiredInjectedTravel) ctx.getBean("autowiredInjectedTravel");
        autowiredInjectedTravel.startJourney();

        ConstructorInjectedTravel constructorInjectedTravel = (ConstructorInjectedTravel) ctx.getBean("constructorInjectedTravel");
        constructorInjectedTravel.startJourney();

        SetterInjectedTravel setterInjectedTravel = (SetterInjectedTravel) ctx.getBean("setterInjectedTravel");
        setterInjectedTravel.startJourney();
    }

}
