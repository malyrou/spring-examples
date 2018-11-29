package com.codehub.springexamples.vehicle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car implements Vehicle, BeanNameAware, BeanFactoryAware, ApplicationContextAware,
        InitializingBean, DisposableBean
{

    private String plateNumber;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void start() {
        System.out.println("Travel by Car");
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("Inside Car's Init Method");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Inside Car's Destroy Method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("### Demo Car Bean has its properties set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("### Demo Car Bean has been destroyed");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("### Demo Car Bean name is " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("### Demo Car Bean Factory has been set ");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("### Demo Car Bean display name is" + applicationContext.getDisplayName());
    }

    public void beforeInit() {
        System.out.println("### Before Car Init called by BeanPostProcessor");
    }

    public void afterInit() {
        System.out.println("### After Car Init called by BeanPostProcessor");
    }


}
