package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CosumerClass {
	public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
    Consumer<String> print=(String str)-> System.out.println(str+"");
	Consumer<String> toUpperCase=(String str)-> System.out.println(str.toUpperCase()+"");
	Consumer<String> toLowerCase=(String str)-> System.out.println(str.toLowerCase()+"");
	System.out.println();
	System.out.println("Printing Lowercase to Uppercase");
	list.forEach(toLowerCase.andThen(toUpperCase));
	
	List<Integer> list_int=Arrays.asList(1,2,3,4);
	System.out.println();
	System.out.println("Printing multiples of List");
    //Adding two values
	Consumer<Integer> add=(Integer n)->{System.out.println(n+n);
		add.accept(10);
	}
	
	//Consumer interface take the argument and dont have return type
	//two methods: accept()--->To give the Argument,andThen()--->Chaining two consumer
	}
}
