package polymorphism;
class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
	
}
class Child extends Parent{
	Child(){
		super();
		System.out.println("Child Constructor");
	}
	
	
	
}

public class ConstructorOverriding {
	public static void main(String[] args) {
		Child obj=new Child();
	}

}
