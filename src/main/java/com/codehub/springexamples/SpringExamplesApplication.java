package com.codehub.springexamples;

import com.codehub.springexamples.travel.AutowiredInjectedTravel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//Now I need this "umbrella" annotation to tell spring to look for @Configuration annotations and other annotations
//and pick up beans and bean wiring from it
@SpringBootApplication
public class SpringExamplesApplication implements CommandLineRunner {

    @Value("${app.name}")
    private String appName;

    @Value("${app.description}")
    private String description;

    @Value("${external.property}")
    private String external;

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringExamplesApplication.class, args);

        AutowiredInjectedTravel travel = ctx.getBean("autowiredInjectedTravel", AutowiredInjectedTravel.class);
        travel.startJourney();

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application's name is: " + appName);
        System.out.println(description);
        //the value of the below property, although existing in default application.properties, will be
        //overridden by the same named property existing in /config, due to higher priority
        System.out.println(external);
    }
}
