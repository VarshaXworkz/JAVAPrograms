package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Course;

import entity.Teacher;

public class Class_Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Teacher.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = null;
		Transaction tx = null;
		Teacher tea=new Teacher("Kamal","Rao");
		Teacher tea1=new Teacher("Shakti","Man");
		Teacher tea2=new Teacher("Sunder","Raj");
		
		Course course=new Course("Java");
		Course course1=new Course("Python");
		Course course2=new Course("MySql");
		Course course3=new Course("JDBC");
		
		try {

			session = sessionFactory.getCurrentSession();

			tx = session.beginTransaction();

			tea.add(course);
			tea.add(course1);
			
			tea1.add(course3);
			tea1.add(course2);
			
			tea2.add(course3);
		
			
		    //Inserting  the record into table we use save
			session.save(tea);
			session.save(tea1);
			session.save(tea2);
			session.save(course);
			session.save(course1);
			session.save(course2);
			session.save(course3);
			
	        tx.commit();
	}catch(Exception e) {
		tx.rollback();
		}finally {
			session.close();
		}
	}
}
