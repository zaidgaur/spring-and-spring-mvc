package com.zaid.spm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext container=new ClassPathXmlApplicationContext("spring-config.xml");
        Demo bean = container.getBean(Demo.class);
        bean.m1();
        System.out.println("it successfully run");
    }
}
