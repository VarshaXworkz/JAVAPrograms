package aggregation;

public class StudentName {
	private String firstName;
	private String lastName;
	public StudentName(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public StudentName() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "StudentName [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
