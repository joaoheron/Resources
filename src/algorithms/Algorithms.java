package algorithms;

public class Algorithms {
	    
	public Algorithms() {}
	
	    public static boolean isOdd(int n) {
	        if (!(n>0)) {
	            return false;
	        }
	        for (int i = 2; i < n; i++) {
	            if (n%i==0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    
	    
	    public static int sumOdd(int start, int end) {
	        if (!(end>=start) || start < 1 || end < 1) {
	            return -1;
	        }
	        int sum = 0;
	        for (int i = start; i <  end + 1; i++) {
	            if(isOdd(i)) {
	                sum+=i;
	            }
	        }
	        return sum;
	    }
	    
	    
	    public static boolean isPalindrome(int number) {
	    	if (number < 10 && number > 0) {
	    		return true;
	    	}
	    	if (number < 0) {
	    		number = number - 2*number;
	    	}
	    	
	        int reverse = 0;
	        int originalNumber = number;
	        while (number > 0) {
	            reverse = reverse*10;
	            int digit = number % 10;
	            reverse = reverse + digit;
	            number/=10;
	        }
	        if (reverse == originalNumber) {
	        	return true;
	        }
	        return false;
	    }
	    
	 
	}
