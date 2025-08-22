package string_use;

public class AllMethods {
	public static void main(String[] args) {
		String str="    Books Gives us Knowledge    ";
		str=str.concat(" And Information");
		System.out.println(str);
		str=str+" And Perspective";
		System.out.println(str);
		String str1="And Insights";
		System.out.println("--------------------------------------------");
		System.out.println("Converting to UpperCase ="+str.toUpperCase());
		System.out.println("--------------------------------------------");
		System.out.println("Converting to LowerCase ="+str.toLowerCase());
		System.out.println("--------------------------------------------");
		System.out.println("Cover 'o' to 'e' :"+str.replace('o','e'));
		System.out.println("--------------------------------------------");
		System.out.println("Replace 's' to 'sss' :"+str.replaceAll("s","sss"));
		System.out.println("--------------------------------------------");
		System.out.println("Convert first 'a' to 'aa' :"+str.replaceFirst("a","aa"));
		System.out.println("--------------------------------------------");
		System.out.println("Deleting 'bc' from the given string :"+str.replaceAll("s",""));
		System.out.println("--------------------------------------------");
		System.out.println("The length of the String="+str.length());
		System.out.println("--------------------------------------------");
		System.out.println("Triming the String:"+str.trim());
		System.out.println("--------------------------------------------");
		System.out.println("String Starting with "+str.startsWith("a"));
		System.out.println("--------------------------------------------");
		System.out.println("String Ending With"+str.endsWith("d"));
		System.out.println("--------------------------------------------");
		System.out.println("Finding the character at index 2="+str.charAt(4));
		System.out.println("--------------------------------------------");
		System.out.println("Substring ="+str.substring(5));
		System.out.println("--------------------------------------------");
		System.out.println("Substring ="+str.substring(5,11));
		System.out.println("--------------------------------------------");
		System.out.println("Substring ="+str.codePointCount(5,11));
		System.out.println("--------------------------------------------");
		System.out.println("Compare To Ignore case is ="+str.compareToIgnoreCase(str1));
		System.out.println("--------------------------------------------");  
		System.out.println("Compare To ="+str.compareTo(str1));
		System.out.println("--------------------------------------------");
		
		
	}

}
