package exceptionHandling;

public class Unchecked {
	public static void main(String[] args) {
	//Airthmetic Exception
    int value = 5/0;

	//Null pointer Exception
    String str = null;
    System.out.println(str.length());

	//NumberFormat exception
    String str1 = "123";
    int intValue = Integer.parseInt(str1);
    System.out.println(intValue);

	//IndexOutOfBound Exception
    int[] arr = new int[4];
    arr[5] = 9;
}
}
