package method_ref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Banu","Tanu","Manu","Dhanu");
		Collections.sort(list,String::compareToIgnoreCase);
		list.forEach(System.out::println);
	}

}//Hint -->Method reference denoted by ::
//Before::->classNameand ObjName;
//After::methodName
