package entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Subjects {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="no_of_subjects")
	private String noOfSubjects;
	@ManyToOne(cascade= {
			CascadeType.DETACH,
			CascadeType.PERSIST,
			CascadeType.REFRESH,
			CascadeType.MERGE
	})@JoinColumn(name="subject_id")
	private Student student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNoOfSubjects() {
		return noOfSubjects;
	}
	public void setNoOfSubjects(String noOfSubjects) {
		this.noOfSubjects = noOfSubjects;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Subjects [id =" + id + ", noOfSubjects=" + noOfSubjects + ", student=" + student + "]";
	}
	public Subjects(String noOfSubjects) {
		super();
		this.noOfSubjects = noOfSubjects;
		
	}
	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
