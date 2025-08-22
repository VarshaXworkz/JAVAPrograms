package method_ref;

import java.util.function.Supplier;

public class SupplierInterface {
	public static void main(String[] args) {
		String str="Hello world";
		
		Supplier<String> upperCase=str::toUpperCase;
		System.out.println(upperCase.get());
		
		
		//Supplier dont accepot the argument but produvce the result
		//get
	}

}
