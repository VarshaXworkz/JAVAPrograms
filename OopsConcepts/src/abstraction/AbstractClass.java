package abstraction;

abstract class School {
	public void swimmingPool() {
		System.out.println("The Swimming suit and Googles are mandatory");
	}

	public abstract void safetyRules();

}

class BVM extends School {

	@Override
	public void safetyRules() {
		System.out.println("The Visitors are Not allowed to the School");

	}

}

class HolySpirits extends School {

	@Override
	public void safetyRules() {
		super.swimmingPool();
		System.out.println("Hazard Tools are not allowed");

	}

}

public class AbstractClass {
	public static void main(String[] args) {
		System.out.println("HolySpirits School safety rules are");
		HolySpirits holySpirits = new HolySpirits();
		holySpirits.safetyRules();
		System.out.println("--------------------------------------------");
		System.out.println("BVM School safety rules are");
		BVM bvm = new BVM();
		bvm.safetyRules();
		bvm.swimmingPool();
	}

}
