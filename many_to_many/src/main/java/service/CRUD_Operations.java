package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Course;
import entity.Student;


public class CRUD_Operations {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		Session session=null;
		Transaction tx=null;
			try {

			session = factory.getCurrentSession();

			tx = session.beginTransaction();
			
			Course course=new Course("Java");
			Course course1=new Course("Python");
			
			Student stu1=new Student("Mohan");
			Student stu2=new Student("Latha");
			
			course.addStudent(stu1);
			course.addStudent(stu2);
			
			session.save(stu1);
			session.save(stu2);
			session.save(course);
			session.save(course1);
		
			 tx.commit();
			 
		} catch (Exception e) {
		//System.out.println("Cannot delete: " + e.getMessage());

		tx.rollback();

		}finally {
			session.close();
		}
	
}

}

