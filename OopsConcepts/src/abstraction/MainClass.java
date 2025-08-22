package abstraction;

public class MainClass implements Interface1 {
	
		@Override
		public void method1() {
			System.out.println("method1 implementation");
			
		}

		@Override
		public void method2() {
			 System.out.println("method2 implementation");
			
		}
	
public static void main(String[] args) {
    MainClass obj = new MainClass();
    obj.method1();  
    obj.method2();  
}
}
