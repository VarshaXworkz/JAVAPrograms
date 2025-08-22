package polymorphism;

public class Var_ArgsSum {
	 public void sum(int... values) {
	        int total = 0;
	       
	        for (int value : values) {
	            total += value;
	        }
	       
	        System.out.println("Sum of provided numbers: " + total);
	    }
	public static void main(String[] args) {
		Var_ArgsSum obj=new Var_ArgsSum();
		obj.sum(1,2);
		obj.sum(1,2,3);
		obj.sum(1,2,3,4);
		obj.sum(1,2,3,4,5);
	}


}
