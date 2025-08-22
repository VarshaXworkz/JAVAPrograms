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
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@ Entity
@ Table(name="course_details")


public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name="course_name")
	String courseName;
	
	@ManyToMany (fetch= FetchType.LAZY,
			cascade= {CascadeType.MERGE,
					  CascadeType.DETACH,
					  CascadeType.REFRESH,
                      CascadeType.PERSIST
	})
    @JoinTable(
            name="student_course",
            joinColumns =@JoinColumn(name= "course"), 
			inverseJoinColumns=@JoinColumn(name ="student")
            )
	private List<Student> students;

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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", students=" + students + "]";
	}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
		//this.students = students;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Scaffolding
	public void addStudent (Student tempStudent) {
        if(students == null) {
        students = new ArrayList<>();
        }
		students.add(tempStudent);
    }

}
