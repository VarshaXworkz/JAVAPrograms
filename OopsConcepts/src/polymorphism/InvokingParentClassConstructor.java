package polymorphism;

class Car{
	int speed=120;
	public void carprice() {
		System.out.println("The price of car is "+600000);
	}
}
class Honda extends Car{
	int speed=120;
	public void carprice() {
		System.out.println("The price of car is "+600000);
	}
	public void print() {
		System.out.println("The Speed of the car is" +super.speed);
		super.carprice();
	}
}

public class InvokingParentClassConstructor {
	public static void main(String[] args) {
		Honda obj=new Honda();
		System.out.println(obj.speed);
		obj.print();
	}

}
