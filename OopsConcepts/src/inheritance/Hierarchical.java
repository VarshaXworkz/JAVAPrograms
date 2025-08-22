package inheritance;


	
	class Animal{
		String AnimalType="Domestic";
	}
	class Cow extends Animal{
	     int Cows=3;
	}
	class Dog extends Animal{
		int Dogs=7;
		
	}
	public class Hierarchical {
		public static void main(String[] args) {
			Dog dog=new Dog();
			System.out.println("The Animal Type is"+(dog.AnimalType));
			System.out.println("The Animal Type is"+(dog.Dogs));
			Cow cow=new Cow();
			System.out.println("The Animal Type is"+(cow.AnimalType));
			System.out.println("The Animal Type is"+(cow.Cows));
		}
	

}
