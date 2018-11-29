package com.codehub.springexamples.vehicle;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CarPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if (o instanceof Car) {
            ((Car) o).beforeInit();
        }
        return o;
    }


    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if (o instanceof Car) {
            ((Car) o).afterInit();
        }
        return o;
    }
}
