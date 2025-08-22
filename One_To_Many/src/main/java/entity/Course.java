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
@Table(name="course_name")
public class Course {
	@Id
	@Column(nullable=false,length=10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String courseName;
	
	
	@ManyToOne(cascade= {
			CascadeType.DETACH,
			CascadeType.PERSIST,
			CascadeType.REFRESH,
			CascadeType.MERGE
	})@JoinColumn(name="teacher_id")
	private Teacher teacher;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", teacher=" + teacher + "]";
	}


	public Course(String courseName) {
		super();
		this.courseName = courseName;
		
	}
	
	
	
    
}
