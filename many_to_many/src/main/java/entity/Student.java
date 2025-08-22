package entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@ Entity
@ Table(name="student_details")

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="student_name")
	private String name;
	@ManyToMany (fetch =FetchType.LAZY,
			cascade= { CascadeType.MERGE,
					   CascadeType.DETACH,
                       CascadeType.REFRESH,
                       CascadeType.PERSIST
	})
    @JoinTable(
            name="student_course",
            joinColumns =@JoinColumn(name= "student"), 
			inverseJoinColumns=@JoinColumn(name ="course")
            )
	private List<Course> course;
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
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	public Student(String name) {
		super();
		this.name = name;
		//this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
