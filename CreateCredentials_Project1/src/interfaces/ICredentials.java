package interfaces;

import model.EmployeeClass;

public interface ICredentials{

	String generateEmailAddress(String firstName, String lastName, String department);

	String generatePassword();

	void showCredentials(EmployeeClass employee);

}
