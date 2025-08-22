package string_use;

public class StringMethods {
	public static void main(String[] args) {
		String str="Hello";
		str=str.concat(" World");
		System.out.println(str);
		str=str+" Good Morning";
		System.out.println(str);
		
		System.out.println("Converting To Upper Case"+str.toUpperCase());
		System.out.println("Converting To Lower Case"+str.toLowerCase());
		System.out.println("--------------------------------------------");
		
		String str1="foot";
		System.out.println("Cover 'o' to 'e' :"+str1.replace('o','e'));
		String str2="abcabcabc";
		System.out.println("Replace 'ab' to 'd' :"+str2.replaceAll("ab","d"));
		System.out.println("--------------------------------------------");
		System.out.println("Replace 'bc' to 'd' :"+str2.replaceAll("bc","d"));
		System.out.println("--------------------------------------------");
		System.out.println("Convert first 'bc' to 'd' :"+str2.replaceFirst("bc","d"));
		System.out.println("--------------------------------------------");
		System.out.println("Deleting 'bc' from the given string :"+str2.replaceAll("a",""));
		System.out.println("--------------------------------------------");
		System.out.println("The length of the String="+str.length());
		System.out.println("--------------------------------------------");
		
		String str3="        ab cd         ";
		System.out.println("Triming the String:"+str3.trim());
		System.out.println("--------------------------------------------");
		
		System.out.println("String Starting with "+str3.startsWith("a"));
		System.out.println("--------------------------------------------");
		
		System.out.println("String Ending With"+str3.endsWith("d"));
		System.out.println("--------------------------------------------");
		System.out.println("Finding the character at index 2="+str1.charAt(2));
		//Substring-It is overloaded method 
		String str4="abcdefghijklmno";
		System.out.println("Substring ="+str4.substring(4));
		System.out.println("Substring ="+str4.substring(4,7));
		System.out.println("Substring ="+str4.codePointCount(4,7));
		
	}

}
