package inheritance;

class Fruits{
	int NoOfFruits=7;
	
}
class Mango extends Fruits{
	void use() {
		System.out.println("The Mango is called the king of the Fruits");
	}
	
}
class Apple extends Fruits{
	void growth() {
		System.out.println("The Apples are grown at the North of the India");
	}
	
}
class Juice extends Apple{
	void drink() {
		System.out.println("The Juice is prepared from Apples");
	}
	
}

public class AllInheritance {
	public static void main(String[] args) {
		Juice juice = new Juice();
		System.out.println("The Total no of Fruits are"+juice.NoOfFruits);
		juice.drink();
		Mango mango=new Mango();
		mango.use();
		Apple apple=new Apple();
		apple.growth();
	}

}
