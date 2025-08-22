package exceptionHandling;

public class Try_Catch {
	public static void main(String[] args) {

		System.out.println("Unchecked Exception Coding: ");

		try {
			System.out.println("Try Block");

			// Null pointer Exception
			String str = null;
			System.out.println(str.length());

			// Airthmetic Exception

			int value = 5 / 0;

			System.out.println("Try Block");

		} catch (ArithmeticException e) {

			System.out.println(e);
		} catch (NullPointerException e) {

			System.out.println(e);
		} catch (NumberFormatException e) {

			System.out.println(e);
		}finally {
			
		}
		System.out.println("Try Block");
	}
}
