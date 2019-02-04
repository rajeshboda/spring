package org.rajesh.boda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		Coach theCoach = context.getBean("myTrackCoach",Coach.class);
		
		
		System.out.println(theCoach.getDailyWorkOut());
		context.close();
		
	}
}
