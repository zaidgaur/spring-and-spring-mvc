package com.zaid.spm.springpropertydemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext container=new ClassPathXmlApplicationContext("config.xml");
       Car car = container.getBean(Car.class);
       car.move();
    }
}
