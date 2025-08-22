package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class Main_Operation {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
//		Student stu=new Student(1,"Anu","Radha","anu@gmail.com");
//		Student stu1=new Student(2,"Shri","Nidhi","nidhi@gmail.com");
//		Student stu2=new Student(3,"Varun","Adam","adam@gmail.com");
//		session.save(stu);
//		session.save(stu1);
//		session.save(stu2);
//		//Retrieving one data
//		Student studentDetails=session.get(Student.class, 3);
//		System.out.println(studentDetails);
		
		//Retrieving multiple data
		List<Student> stuRecords=session.createQuery("from Student").list();
		for(int i=0;i<stuRecords.size();i++) {
			System.out.println(stuRecords.get(i));
		}
		
		//updating data
	    Student stuRecords1=session.get(Student.class, 2);
	    stuRecords1.setEmail("sri@gmail.com");
	    session.update(stuRecords1);
		
		//updating record through query
		session.createQuery("update Student set email='ada@gmail.com' where id=3")
		.executeUpdate();
		
		//deleting data
//		Student stuRecords2=session.get(Student.class, 3);
//		session.delete(stuRecords2);
		tx.commit();
	
	}

}
