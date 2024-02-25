package com.zaid.springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DAO {

	public static void main(String[] args) {
	 BeanFactory container= new ClassPathXmlApplicationContext("spring-config.xml");
	 BeanDemo bean = container.getBean(BeanDemo.class);
	 System.out.println(bean);
	 System.out.println("beanfactory works here");
	 bean.m();
	 

	}

}
