package org.rajesh.boda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getDailyFortuneService());
		
		coach = context.getBean("myCoachTrack", Coach.class);
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getDailyFortuneService());
		
		coach = context.getBean("myRandomCoach", Coach.class);
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getDailyFortuneService());
		
		context.close();

	}

}
