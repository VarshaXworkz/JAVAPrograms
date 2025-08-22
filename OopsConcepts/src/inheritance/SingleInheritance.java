package inheritance;


	class Parent{
		int parentAge=45;
		void cook() {
			System.out.println("Cook Deliciously");
		}
	}
	class Child extends Parent{
		int childAge=20;
		void cook() {
			System.out.println("Eats A Lot");
		}
		void play() {
			System.out.println("Plays wonderfully");
		}
		void print() {
			play();
			cook();
		}
	}
	public class SingleInheritance {
	
	public static void main(String[] args) {
		Child child=new Child();
		System.out.println("Child Age ="+(child.childAge));
		System.out.println("Parent Age ="+(child.parentAge));
		//child.cook();
		//child.play();
		child.print();
		//System.out.println("Parent Role ="+(child.cook));
		
	}

}
