package com.zaid.spm.sp_aw_bpMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext container=new ClassPathXmlApplicationContext("scope-autowire.xml");
        A a = container.getBean(A.class);
        a.m1();
        
    }
}
