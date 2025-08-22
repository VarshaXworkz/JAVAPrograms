package exceptionHandling;

import java.io.IOException;

public class ExceptionPropogation1 {
	public void method1() throws IOException (

			System.out.println("I am method1");

			throw new IOException("IOException is not handled");

			public void method2() {

			try {
			} catch (IOException e) {

			System.out.println(e);

			System.out.println("I am method2");}
			}

			public static void main(String[] args) {
				ExceptionPropogation1 obj= new ExceptionPropogation1();

				obj.method2();
			}
}
