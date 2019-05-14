package org.rajesh.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.rajesh.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		Student tempStudent = new Student("Rajesh", "Boda", "rajesh.boda@sap.com");

		// start a transaction
		session.beginTransaction();

		// save the student object
		System.out.println("Saving the student...");
		session.save(tempStudent);

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
