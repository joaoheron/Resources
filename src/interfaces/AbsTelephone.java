package interfaces;

import java.util.List;

public abstract class AbsTelephone {

	
	public AbsTelephone() {
	}
	
	private int num;
	public int numFake;
	
	abstract List write();
	abstract void powerOn();
	public abstract void dial(int phoneNumber);
	public abstract void answer();
	
	public boolean callPhone(int PhoneNumber) { 
		int x = 2 + 3;
		return false;
	}
	
	boolean isRinging() {
		System.out.println();
		return false;
	}

}
