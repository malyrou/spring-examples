package com.codehub.springexamples.travel;

import com.codehub.springexamples.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class AutowiredInjectedTravel {

    //This is the dependency
    //No setter or constructor is needed
    //We need this annotation here to know where to Autowire
    @Autowired
    private List<Vehicle> vehicleList;

    @Autowired
    private Set<Vehicle> vehicleSet;

    @Autowired
    private Map<String, Vehicle> vehicleMap;


    public void startJourney() {
        printAllAutowiredDependencies();
    }

    private void printAllAutowiredDependencies() {
        System.out.println(vehicleList);
        System.out.println(vehicleSet);
        System.out.println(vehicleMap);
    }

}



