package com.rajesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {
	public static void main(String[] args) {

			//load from Spring
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach = context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getDailyFortune());
		System.out.println("team->"+ coach.getTeam());
		System.out.println("email:"+coach.getEmailAddress());
		context.close();
	}
}
