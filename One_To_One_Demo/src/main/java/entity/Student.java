package entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student_name")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Student_Id",nullable=false,length=15)
	private int id;
	@Column(name="f_name",nullable=false,length=15)
	private String f_name;
	@Column(name="l_name",nullable=false,length=15)
	private String l_name;
	//Join 
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Student_Id")
	StudentDetails stuDetails;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	
	public StudentDetails getStuDetails() {
		return stuDetails;
	}
	public void setStuDetails(StudentDetails stuDetails) {
		this.stuDetails = stuDetails;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", f_name=" + f_name + ", l_name=" + l_name + "]";
	}
	public Student(String f_name, String l_name) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
