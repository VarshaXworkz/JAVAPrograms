package string_use;

import java.util.Arrays;
import java.util.StringJoiner;

public class Concatenation {
	public static void main(String[] args) {
		String str1 = "Hello";
	

		String str2 = "World";

		String str = str1.concat("");

		System.out.println(str.concat(str2));

		System.out.println(str1+" "+ str2);

		String str3 = String.format("%s%s", str1, str2);

		System.out.println(str3);

		String str4 = String.join(", ", str1,str2);

		System.out.println(str4);
		
		StringJoiner sj = new StringJoiner(" ");

		sj.add("Anu");

		sj.add("Banu");

		sj.add("Arun");
		
		System.out.println(sj);
		
		String str5 = new String("Hello, I, am, Hrutiksha!!");

		String[] str6= str5.split(",");

		System.out.println(str6[0]);

		System.out.println(str6[1]);

		System.out.println(Arrays.toString(str6));
}
}