package inheritance;

class EnglishTeacher{
	public void write() {
		System.out.println("Write thye English alphabets");
	}
	
}
//class MathsTeacher{
//	public void write() {
//	System.out.println("Write thye Maths Numericals");
//	}
//}
class Student extends EnglishTeacher{
	public void write() {
	}
	
}

public class Multiple {
	Student student=new Student();
	


}
