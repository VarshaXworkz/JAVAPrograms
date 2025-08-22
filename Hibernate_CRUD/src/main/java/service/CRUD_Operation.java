package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Employee;

public class CRUD_Operation {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Employee emp=new Employee(1,"Anu","IT");
		Employee emp1=new Employee(2,"Shri","ECE");
		Employee emp2=new Employee(3,"Varun","Mech");
		session.save(emp);
		session.save(emp1);
		session.save(emp2);
		//Retrieving one data
		Employee employeeDetails3=session.get(Employee.class, 3);
		System.out.println(employeeDetails3);
		
		//Retrieving multiple data
		List<Employee> empRecords=session.createQuery("from Employee").list();
		for(int i=0;i<empRecords.size();i++) {
			System.out.println(empRecords.get(i));
		}
		
		//updating data
		Employee empDetails2=session.get(Employee.class, 2);
		empDetails2.setName("Srinidhi");
		session.update(empDetails2);
		
		//updating record through query
		session.createQuery("update Employee set dept_name='Admin' where id=2")
		.executeUpdate();
		
		//deleting data
//		Employee empDetails3=session.get(Employee.class, 3);
//		session.delete(empDetails3);
		tx.commit();
	}

}
