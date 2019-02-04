package com.rajesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean flag = theCoach == alphaCoach;
		System.out.println(flag);
		System.out.println(theCoach.toString());
		System.out.println(alphaCoach.toString());
		

	}

}
