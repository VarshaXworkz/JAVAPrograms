package wrapper;

public class IntToString {
		public static void main(String[] args) {
			int intValue = 20;
			float floatValue = 20.0F;
			
			String str1 = Integer.toString(intValue);
			
			String str2 = String.valueOf(intValue);
			String str3 = String.valueOf(floatValue);
			
			String str4 = " " + intValue;
			String str5 = " " + floatValue;
			
			String str6 = String.format("%d", intValue);
			
			StringBuilder sb = new StringBuilder();
			sb.append(floatValue);
			String str7 = sb.toString();
			System.out.println(intValue);
			System.out.println(floatValue);
			System.out.println(intValue + floatValue);
		

	}
}
