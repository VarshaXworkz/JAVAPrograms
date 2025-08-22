package aggregation;

public class MainClass {
public static void main(String[] args) {
	StudentName name=new StudentName("Hrutiksha","V");
	Student stu=new Student(1,name);
	System.out.println("The Id  Is = "+stu.getId()+" and The Name Is = "+stu.getName());
	
}
	

}
