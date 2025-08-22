package main;

import java.util.Scanner;

import interfaces.ICredentials;
import model.EmployeeClass;
import service.CredentialService;

public class DriverClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The First Name :");
		String fName = scanner.nextLine();
		String firstName = fName.toLowerCase();
		System.out.println(firstName);

		System.out.println("Enter The Last Name :");
		String lName = scanner.nextLine();
		String lastName = lName.toLowerCase();
		System.out.println(lastName);

		ICredentials iCredential = new CredentialService();
		int option;
		int flag = 0;
		String department = "";
		String generateEmailId = "";
		String generatePassword = "";

		do {
			System.out.println("Enter the Department From The Following:");
			System.out.println("1.Tecnical");
			System.out.println("2.Admin");
			System.out.println("3.Human Resource");
			System.out.println("4.Legal");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				department = "tecnical";
				generateEmailId = iCredential.generateEmailAddress(firstName, lastName, department);
				generatePassword = iCredential.generatePassword();
				flag = 1;
				break;
			case 2:
				department = "admin";
				generateEmailId = iCredential.generateEmailAddress(firstName, lastName, department);
				generatePassword = iCredential.generatePassword();
				flag = 1;
				break;
			case 3:
				department = "hr";
				generateEmailId = iCredential.generateEmailAddress(firstName, lastName, department);
				generatePassword = iCredential.generatePassword();
				flag = 1;
				break;
			case 4:
				department = "legal";
				generateEmailId = iCredential.generateEmailAddress(firstName, lastName, department);
				generatePassword = iCredential.generatePassword();
				flag = 1;
				break;

			default:
				System.out.println("Invalid Option");
			}

		} while (flag == 0);

		EmployeeClass employee = new EmployeeClass(firstName, lastName, department);
		employee.setEmailId(generateEmailId);
		employee.setPassword(generatePassword);

		System.out.println("Dear " + firstName + " Your generated credential are as follows:");
		iCredential.showCredentials(employee);
	}

}
