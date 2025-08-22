package string_use;

public class StringComparision {
	public static void main(String[] args) {
		String str_literals="Hello";
		String str_literals1="Hello";
		String str_literals_lower="hello";
		
		String str_obj=new String("hello");
		String str_obj1=new String("hello");
		String str_literals_upper=new String("Hello");
		//compares the memory location
		System.out.println("Comparing String Literals: "+(str_literals==str_literals1));
		System.out.println("Comparing String Literals: "+(str_literals==str_literals_lower));
		System.out.println("Comparing New Keyword :"+(str_obj==str_obj1));
		System.out.println("Comparing New Keyword: "+(str_obj==str_literals_upper));
		
		//compares the values
		System.out.println("Comparing str_literals with str_literals_upper: "+(str_literals.equals(str_literals_upper)));
		System.out.println("Comparing str_literals and str_obj1 :"+(str_literals.equals(str_obj1)));
		System.out.println("Cmparing str_literals and str_obj1 with ignore case :"+(str_literals.equalsIgnoreCase(str_obj1)));
		
	    //comparing using compare To
		System.out.println("Comparing same case: "+str_obj1.compareTo(str_obj));
		System.out.println("Comparing upper case with lower case: "+str_literals_upper.compareTo(str_obj));
		System.out.println("Comparing Lower case with Upper case: "+str_obj.compareTo(str_literals_upper));
	}

}
