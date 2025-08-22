package entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student_dept")

public class StudentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	@Column(name="department",nullable=false,length=15)
	private String dept_name;
	@Column(name="state",nullable=false,length=15)
	private String state;
	
	@OneToOne(mappedBy = "stuDetails",cascade=CascadeType.ALL)
	Student stu;
	
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDetails(String dept_name, String state) {
		super();
		this.dept_name = dept_name;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", dept_name=" + dept_name + ", state=" + state + "]";
	}
     
	
}
