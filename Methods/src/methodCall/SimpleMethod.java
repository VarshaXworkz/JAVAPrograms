package methodCall;

import java.lang.reflect.Method;

public class SimpleMethod {
	
	static String studentName;
	static int studentMark;
	static int total=0;
	
	public static void assignValues(String name,int mark ) {
		studentName=name;
		studentMark=mark;
	}
	public static void print() {
		System.out.println(studentName+"="+studentMark);
	}
    public static void sum() {
    	total+=studentMark;
    	System.out.println("Total Mark:"+total);
    }
    public static void main(String[] args) {
    	SimpleMethod.assignValues("Anu",89);
    	SimpleMethod.print();
    	SimpleMethod.sum();
	}
}
