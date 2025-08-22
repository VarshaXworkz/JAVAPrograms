package abstraction;

public class TV implements TvRemote,AirtelRemote{

	@Override
	public void volume() {
	System.out.println("Volume + will increase the volume");
	System.out.println("Volume - will decrease the volume");
	}
	@Override
	public void balance() {
		//TvRemote.super.balance();
		AirtelRemote.super.balance();
	}
	public static void main(String[] args) {
		TV obj=new TV();
		obj.volume();
		TvRemote.channel();
		AirtelRemote.channel();
		obj.balance();
	}

}
