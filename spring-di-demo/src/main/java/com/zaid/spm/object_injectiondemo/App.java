package com.zaid.spm.object_injectiondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext container =new ClassPathXmlApplicationContext("injection.xml");
        Car car = container.getBean(Car.class);
        Engine engine = EngineFactory.createEngine("power");
        car.setEng(engine);
        car.move();
    }
}
