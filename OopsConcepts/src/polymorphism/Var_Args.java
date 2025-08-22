package polymorphism;

public class Var_Args {
	
	public void sum(int...value) {
		
		for(int arr:value) {
			System.out.print(arr+ "");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		Var_Args obj=new Var_Args();
		obj.sum(1,2);
		obj.sum(1,2,3);
		obj.sum(1,2,3,4);
		obj.sum(1,2,3,4,5);
	}

}
