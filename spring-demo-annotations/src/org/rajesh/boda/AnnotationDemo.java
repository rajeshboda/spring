/**
 * 
 */
package org.rajesh.boda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author I336121
 *
 */
public class AnnotationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach tenisCoach = context.getBean("myFirstBean", Coach.class);
		System.out.println(tenisCoach.getDailyWorkOut()+"\n ");
		
		System.out.println(tenisCoach.getDailyFortune());
		
		/*Coach rugbyCoach = context.getBean("rugbyCoach", Coach.class);
		System.out.println(rugbyCoach.getDailyWorkOut()+"\n ");*/
		
		
		context.close();

	}

}
