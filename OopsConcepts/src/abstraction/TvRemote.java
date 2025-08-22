package abstraction;

public interface TvRemote {
	//abstract method
	public void volume();
	//static method
	public static void channel() {
		System.out.println("The number 1 Chintu TV");
	}
	default void balance() {
		System.out.println("The Channel Goes to menu");
	}

}
