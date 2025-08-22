
package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Student;
import entity.Subjects;



public class CRUD_operation{
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Subjects.class).addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = null;
		Transaction tx = null;
		Student stu4=new Student();
		stu4.setId(4);
		stu4.setName("Tilak");
		stu4.setEmail("tilak@gmail.com");
		stu4.setStudents_subjects("Science");
		
		
		Subjects sub=new Subjects("Science");
		Student stu=new Student("Kamal","Rao@gmail.com","Science");
		Student stu1=new Student("Shakti","Man@gmail.com","Maths");
		Student stu2=new Student("Sunder","Raj@gmail.com","Science");
		
		
		try {

			session = sessionFactory.getCurrentSession();

			tx = session.beginTransaction();
		
			
		    //Inserting  the record into table we use save
			session.save(stu);
			session.save(stu1);
			session.save(stu2);
			session.save(stu4);
			session.save(sub);
			
			
	        tx.commit();
	}catch(Exception e) {
		tx.rollback();
		}finally {
			session.close();
		}
	}

	}


