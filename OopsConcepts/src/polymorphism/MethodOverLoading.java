package polymorphism;

public class MethodOverLoading {
	public int sum() {
		return this.sum(10);
		
	}
	public int sum(int intvalue) {
		return this.sum(intvalue,10);
		
	}
	public int sum(int intvalue1,int intvalue2) {
		int add=intvalue1+intvalue2;
		this.sum(10.0,add);
		return add;
		
	}
	public void sum(double floatValue,int intValue) {
		double result=floatValue+intValue;
		System.out.println("Final result="+result);
		
	}
	public static void main(String[] args) {
		MethodOverLoading obj=new MethodOverLoading();
		int result=obj.sum();
		System.out.println("The result is ="+result);
	}
	

}
