package thread;

public class Multithread extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
			System.out.println("Priority of "+Thread.currentThread().getName()+"="+Thread.currentThread().getPriority());
			System.out.println("Is Daemon"+Thread.currentThread().getName()+"="+Thread.currentThread().isDaemon());
		}
		
	}
	public static void main(String[] args) {
		Multithread obj=new Multithread();
		Multithread obj1=new Multithread();
		Multithread obj2=new Multithread();
		Multithread obj3=new Multithread();
		Multithread obj4=new Multithread();
		obj.setDaemon(true);
		obj.start();
		obj.setName("Thread - A");
		try {
			obj.join(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    System.out.println(obj.getName());
		obj1.start();
		obj1.setName("Thread - B");
		obj1.setPriority(MAX_PRIORITY);
		obj2.start();
		obj2.setName("Thread - C");
		obj2.setPriority(MIN_PRIORITY);
		obj3.start();
		obj3.setName("Thread - D");
		obj3.setPriority(NORM_PRIORITY);
		obj4.start();
		obj4.setName("Thread - E");
		obj4.setPriority(7);
		
	}

}
