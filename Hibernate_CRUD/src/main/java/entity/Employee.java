package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="IT Employee")
public class Employee {
	@Id
	//@GeneratedValue()
    private int id;
	@Column(name="Emp_name")
    private String name;
	@Column
    private String dept_name;
    
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, String dept_name) {
		super();
		this.id = id;
		this.name = name;
		this.dept_name = dept_name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept_name=" + dept_name + "]";
	}
}
