package methodCall;

public class ThreeMarksMethod {
	static String studentName;
	static int studentMark1;
	static int studentMark2;
	static int studentMark3;
	static int total = 0;

	public static void assignValues(String name, int mark1, int mark2, int mark3) {
		studentName = name;
		studentMark1 = mark1;
		studentMark2 = mark2;
		studentMark3 = mark3;
	}

	public static void print() {
		System.out.println(studentName + "=" + studentMark1 + "+" + studentMark2 + "+" + studentMark3);
		System.out.println("Total Mark:" + total);
	}

	public static void sum() {
		total += studentMark1 + studentMark2 + studentMark3;

	}

	public static void main(String[] args) {
		ThreeMarksMethod.assignValues("Hrutiksha", 89, 78, 99);

		ThreeMarksMethod.sum();
		ThreeMarksMethod.print();
	}
}
