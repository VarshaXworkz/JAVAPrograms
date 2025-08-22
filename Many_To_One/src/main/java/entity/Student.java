package entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="Students_name")
	private String name;
	@Column(name="Students_email")
	private String email;
	@Column(name="Students_subject")
	private String Students_subjects;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="student",
			cascade= {CascadeType.DETACH,
			CascadeType.PERSIST,
			CascadeType.REFRESH,
			CascadeType.MERGE})
	private List<Subjects>subjects;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Subjects> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}
	
	public String getStudents_subjects() {
		return Students_subjects;
	}
	public void setStudents_subjects(String students_subjects) {
		Students_subjects = students_subjects;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", Students_subjects=" + Students_subjects
				+ ", subjects=" + subjects + "]";
	}
	public Student(String name, String email, String students_subjects) {
		super();
		this.name = name;
		this.email = email;
		//Students_subjects = students_subjects;
		this.subjects = subjects;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
