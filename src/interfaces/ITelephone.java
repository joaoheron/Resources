package interfaces;

import java.util.List;

public interface ITelephone {
	// Interfaces:
	// Define the methods which will be implemented in the classes that implement this interface
	// Only do declarations, not implementations (depends of which java version is running)
	// All methods are "public abstract" by default
	// All variables are "static final" by default
	// Does not allow constructors
	
	static final long constant = 1111L;
	List write();
	void powerOn();
	void dial(int phoneNumber);
	void answer();
	boolean callPhone(int PhoneNumber);
	boolean isRinging();
	// from java 8 and on we can have DEFAULT methods on the interface, those can be implemented inside the interface class
	default boolean retornaTrue() {
		return true;
	}
	// from java 9 and on interfaces can have private methods
}
