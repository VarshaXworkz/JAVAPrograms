package encapsulation;

public class Main {
	public static void main(String[] args) {
		POJO pojo=new POJO();
		pojo.setId(10);
		System.out.println("Student Id is"+pojo.getId());
		pojo.setName("Kamala");
		System.out.println("Student Name is"+pojo.getName());
	}

}