package org.rajesh.boda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Coach theCoach = context.getBean("pingPongCoach", Coach.class);
		// call a method on the bean
		System.out.println(theCoach.getDailyFortune());

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkOut());

		// close the context
		context.close();

	}
}
