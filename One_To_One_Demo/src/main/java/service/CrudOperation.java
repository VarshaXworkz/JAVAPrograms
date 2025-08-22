package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Student;
import entity.StudentDetails;

public class CrudOperation {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetails.class)
				.buildSessionFactory();
		Session session=null;
		Transaction tx=null;
		Student stu1=new Student("Mohan","Lal");
		Student stu2=new Student("Latha","Rai");
		Student stu3=new Student("Kapil","Sharma");
		
		StudentDetails stuDetails=new StudentDetails("IT","Karnataka");
		StudentDetails stuDetails1=new StudentDetails("ME","Kerala");
		StudentDetails stuDetails2=new StudentDetails("CS","Assam");
		
		try {

			session = factory.getCurrentSession();

			tx = session.beginTransaction();

			//Using setters we are passing the student details

			stu1.setStuDetails (stuDetails);
			stu2.setStuDetails (stuDetails1);
			stu3.setStuDetails (stuDetails2);
			
		    //Inserting  the record into table we use save
			session.save(stu1);
			session.save(stu2);
			session.save(stu3);
			System.out.println("Done");
			
			//retreiving 2nd record
			Student stuRecord2 = session.get(Student.class, 2);
            System.out.println(stuRecord2);
           
			
			//deleting 1st record
            Student stus1 = session.get(Student.class, 1);
			session.delete(stus1);
			
            tx.commit();
			} catch (Exception e) {
			//System.out.println("Cannot delete: " + e.getMessage());

			tx.rollback();

			}finally {
				session.close();
			}
		
	}

}
