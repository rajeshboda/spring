package org.rajesh.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.rajesh.hibernate.demo.entity.Student;

public class ReadStudentDemo {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		Student tempStudent = new Student("Parnika", "Boda", "Parnika.boda@gmail.com");

		// start a transaction
		session.beginTransaction();

		// save the student object
		System.out.println("Saving the student..." + tempStudent.toString());

		// System.out.println("Id--" + tempStudent.getId());
		session.save(tempStudent);

		// commit transaction
		session.getTransaction().commit();

		// begin a new transaction...
		session = factory.getCurrentSession();
		session.beginTransaction();
		Student myStudent = session.get(Student.class, tempStudent.getId());
		System.out.println("Getting the student..." + myStudent.toString());

		session.getTransaction().commit();
		System.out.println("Done!");

		try {

		} catch (Exception e) {

		} finally {
			factory.close();
		}

	}
}
