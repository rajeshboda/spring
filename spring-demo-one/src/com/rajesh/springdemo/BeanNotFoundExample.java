package com.rajesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanNotFoundExample {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach=  context.getBean("myCricketCoach", Coach.class);
		
		
		String fort = coach.getDailyWorkOut();
		System.out.println(fort);
		context.close();

	}

}
