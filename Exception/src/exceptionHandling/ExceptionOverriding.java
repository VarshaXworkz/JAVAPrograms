package exceptionHandling;

	class Parent {

		public void print() {

			System.out.println("Printing.......");

		}

	}

	public class ExceptionOverriding extends Parent {

		@Override
		public void print() {

			System.out.println("Printing......");

		}


	public static void main(String[] args) {

		ExceptionOverriding obj = new ExceptionOverriding();
		obj.print();

	}

}
