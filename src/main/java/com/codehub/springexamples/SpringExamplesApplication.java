package com.codehub.springexamples;

import com.codehub.springexamples.config.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

//Now I need this "umbrella" annotation to tell spring to look for @Configuration annotations and other annotations
//and pick up beans and bean wiring from it
@SpringBootApplication
//Instead of injecting PropertiesConfig, we could use @EnableConfigurationProperties annotation
//@EnableConfigurationProperties(PropertiesConfig.class)
public class SpringExamplesApplication implements CommandLineRunner {

    @Autowired
    private PropertiesConfig propertiesConfig;

    public static void main(String[] args) {
        SpringApplication.run(SpringExamplesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("*--------Config Object-------*");
        System.out.println("Simple Values");
        System.out.println(propertiesConfig.getHost());
        System.out.println(propertiesConfig.getPort());
        System.out.println("Additional Header Values");
        for (Map.Entry<String, String>  entry :
                propertiesConfig.getAdditionalHeaders().entrySet()) {
            System.out.println(entry);
        }

        System.out.println(propertiesConfig.getCredentials().getUsername());
        System.out.println(propertiesConfig.getCredentials().getPassword());
        System.out.println(propertiesConfig.getCredentials().getAuthMethod());
    }
}
