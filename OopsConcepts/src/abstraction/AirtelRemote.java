package abstraction;

public interface AirtelRemote {
	//abstract method
		public void volume();
		//static method
		public static void channel() {
			System.out.println("The number 1 Cartoon Network");
		}
		default void balance() {
			System.out.println("The Channel Goes to Home");
		}

}
