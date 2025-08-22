package string_use;

public class BuilderAndBuffer {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("hello");
		StringBuilder sb1=new StringBuilder("hello");
		sb.append("world");
		System.out.println(sb);
		StringBuffer sbf=new StringBuffer("Good");
		StringBuffer sbf1=new StringBuffer("Goood");
		sbf.append("Morning");
		System.out.println(sbf);
		//In string builder the equls method is not overriden
		System.out.println(sb.equals(sb1));//compares the reference
		System.out.println(sb.toString().equals(sb1.toString()));//compares the value
		
		}

}
