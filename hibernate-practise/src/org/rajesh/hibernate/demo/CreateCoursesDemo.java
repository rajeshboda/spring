package org.rajesh.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.rajesh.hibernate.demo.entity.Courses;


public class CreateCoursesDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml").addAnnotatedClass(Courses.class);
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.toString());
		Session session = factory.getCurrentSession();
		try {
			
			System.out.println(session.toString());
			
			Courses tempCourses = new Courses("Rajesh", "Boda", "rajeshboda24@gmail.com");
			System.out.println(tempCourses.toString());
			session.beginTransaction();
			session.save(tempCourses);

			// commit transaction
			session.getTransaction().commit();
			
			session.close();
		}

		catch (Exception e) {
			//session.close();

		} finally {
			session.flush();
            factory.close();
			factory.close();
			
		}

	}

}
