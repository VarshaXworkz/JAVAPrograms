package lambdaExpression;
interface FunctionalInterface{
	public  void calculate(int num1,int num2);
}


public class TwoParameters {
	public static void main(String[] args) {
		FunctionalInterface obj=(int num1,int num2)->System.out.println( num1+num2);
		obj.calculate(2, 3);
	}

}
