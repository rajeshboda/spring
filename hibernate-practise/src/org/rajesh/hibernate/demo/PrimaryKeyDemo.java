/**
 * 
 */
package org.rajesh.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.rajesh.hibernate.demo.entity.Student;

/**
 * @author I336121
 *
 */
public class PrimaryKeyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		//Create multiple Students
		
		System.out.println("Creating 3 students");
		Student tempStudent1 = new Student("Rajesh", "Boda", "rajesh.boda@mvgr.com");

		Student tempStudent2 = new Student("two", "two", "two.two@two.com");

		Student tempStudent3 = new Student("three", "three", "three.three@three.com");

		
		// start a transaction
		session.beginTransaction();

		// save the student object
		System.out.println("Saving the student...");
		session.save(tempStudent1);
		session.save(tempStudent2);
		session.save(tempStudent3);

		// commit transaction
		session.getTransaction().commit();

		System.out.println("Done!");

		try {

		} catch (Exception e) {

		} finally {
			factory.close();
		}

	}

}
