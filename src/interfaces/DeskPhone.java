package interfaces;

import java.util.List;

public class DeskPhone implements ITelephone{
	
	private int myNumber;
	private boolean isRinging;
	
	@Override
	public void powerOn() {
		System.out.println("No action");
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Ringing to" + phoneNumber);
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean callPhone(int PhoneNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List write() {
		// TODO Auto-generated method stub
		return null;
	}

}
