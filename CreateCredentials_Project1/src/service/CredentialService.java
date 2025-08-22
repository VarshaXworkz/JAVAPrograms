package service;

import java.util.Random;

import interfaces.ICredentials;
import model.EmployeeClass;

public class CredentialService implements ICredentials{
	
	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		String emailId = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + ".abc.com";
		emailId = emailId.replace(" ", "");
		return emailId;
	}
		
    @Override
	public String generatePassword() {

		String password = "";
		String finalPassword = "";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String specialCharacters = "!@%^&*#";
		Random random = new Random();

		for (int i = 0; i < 2; i++) {
			System.out.println(capitalLetters.length());
			int index = random.nextInt(specialCharacters.length());
			System.out.println(index);
			char character = capitalLetters.charAt(index);
			password = password + String.valueOf(character);
		}
		for (int i = 0; i < 2; i++) {
			int index = random.nextInt(smallLetters.length());
			System.out.println(index);
			char character = smallLetters.charAt(index);

			password = password + String.valueOf(character);
		}

		for (int i = 0; i < 2; i++) {
			int index = random.nextInt(numbers.length());
			System.out.println(index);
			char character = numbers.charAt(index);
			password = password + String.valueOf(character);
		}

		for (int i = 0; i < 2; i++) {
			int index = random.nextInt(specialCharacters.length());
			System.out.println(index);
			char character = specialCharacters.charAt(index);
			password = password + String.valueOf(character);
		}
		StringBuffer buffer = new StringBuffer(password);
		for (int i = 0; i < 8 ;i++){
		int index = random.nextInt(buffer.toString().length());
		char character = buffer.toString().charAt(index);
		finalPassword = finalPassword + String.valueOf(character);
	}

	return finalPassword;

	}
    @Override

	public void showCredentials(EmployeeClass employee) {
		System.out.println("Email----"+employee.getEmailId());
		System.out.println("Password----"+employee.getPassword());
	}

	

}
