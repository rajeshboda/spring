package org.rajesh.boda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(coach.getDailyFortuneService());
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());
		context.close();

	}

}
