package com.codehub.springexamples;

import com.codehub.springexamples.travel.AutowiredInjectedTravel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//Now I need this "umbrella" annotation to tell spring to look for @Configuration annotations and other annotations
//and pick up beans and bean wiring from it
@SpringBootApplication
public class SpringExamplesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringExamplesApplication.class, args);

        AutowiredInjectedTravel travel = ctx.getBean("autowiredInjectedTravel", AutowiredInjectedTravel.class);
        travel.startJourney();
    }

}
