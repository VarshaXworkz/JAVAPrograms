package polymorphism;

public class ConstructorOverloading {
	ConstructorOverloading() {
      this(5);
      System.out.println("Iam no Args Constructor");
	}

	ConstructorOverloading(int value1) {
		this(10,5);
		System.out.println("The result is"+value1);

	}

	ConstructorOverloading(int value1, int value2) {
		System.out.println("The value1 is"+value1 +"The value2 is"+value2);
		

	}
	public static void main(String[] args) {
		ConstructorOverloading obj=new ConstructorOverloading();
	
	}
}
