package inheritance;

class Principal{
	int PrincipalTime=3;
}
class Coordinator extends Principal{
	int CoordinatorTime=5;
	
}
class Teacher extends Coordinator{
	int TeacherTime=8;
	
}
public class Multilevel {
	public static void main(String[] args) {
		Teacher teacher=new Teacher();
		System.out.println("Teacher Time is="+(teacher.TeacherTime));
		System.out.println("Coordinator  Time is="+(teacher.CoordinatorTime));
		System.out.println("Principal Time is="+(teacher.PrincipalTime));

}
}
