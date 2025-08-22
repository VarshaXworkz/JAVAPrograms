package lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class Collection_LE {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,5);
	//normal for each
	System.out.println("Normal for Each:");
	for(Integer n:list) {
		System.out.println(n);
	}
	
	//using lambda
	System.out.println("forEach using lambda expressions :");
	list.forEach(n->System.out.println(n));
}
}
