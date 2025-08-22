package exceptionHandling;

public class ExceptionPropogation {
	public void method1() {

		System.out.println("I am method1");

		throw new ArithmeticException("Sorry!!Arithmetic Exception occured");

		public void method2() {

		this.method1();

		System.out.println("I am method?"); }

		public static void main(String[] args) {

		ExceptionPropogation obj= new ExceptionPropogation();

		obj.method2();

		}


}
