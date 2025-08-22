package thread;

public class MultiThread_Runnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Running........");
	}

	public static void main(String[] args) {
		MultiThread_Runnable ref = new MultiThread_Runnable();
		Thread thread_obj = new Thread(ref);
		thread_obj.start();

	}

}