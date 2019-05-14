package org.rajesh.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.rajesh.hibernate.demo.entity.Employee;

public class CreateEmployeeDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();
		try {
			Session session = factory.getCurrentSession();

			
			Employee tempEmp = new Employee("Rajesh1", "Boda1", "rajeshboda1@gmail.com");
			session.beginTransaction();
			session.save(tempEmp);

			// commit transaction
			session.getTransaction().commit();
		}

		catch (Exception e) {

		} finally {
			factory.close();
		}

	}

}
