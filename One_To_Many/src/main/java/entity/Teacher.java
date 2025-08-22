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
	@Table(name="teacher_name")
	public class Teacher {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="Student_Id",nullable=false,length=15)
		private int id;
		@Column(name="f_name",nullable=false,length=15)
		private String f_name;
		@Column(name="l_name",nullable=false,length=15)
		private String l_name;
		@OneToMany(fetch=FetchType.LAZY,mappedBy="teacher",
				cascade= {CascadeType.DETACH,
				CascadeType.PERSIST,
				CascadeType.REFRESH,
				CascadeType.MERGE})
		private List<Course>course;
		
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

		public List<Course> getCourse() {
			return course;
		}

		public void setCourse(List<Course> course) {
			this.course = course;
		}

		@Override
		public String toString() {
			return "Teacher [id=" + id + ", f_name=" + f_name + ", l_name=" + l_name + ", course=" + course + "]";
		}

		public Teacher(String f_name, String l_name) {
			super();
			this.f_name = f_name;
			this.l_name = l_name;
			
		}
		

		public Teacher() {
			super();
	
		}

		//Scaffolding
		public void add(Course tempCourse) {
			if(course==null) {
				course=new ArrayList<>();
				}
			course.add(tempCourse);
			tempCourse.setTeacher(this);
		}      

}
