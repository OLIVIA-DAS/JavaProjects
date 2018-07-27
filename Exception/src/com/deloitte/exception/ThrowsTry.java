package com.deloitte.exception;

class IllegalAgeException extends Exception{
	@Override
	public String getMessage() {
		
		return "The person needs to be 18+ for voting :D";
	}
	
}

class Voter{
	public void register(int age) throws IllegalAgeException {
		if(age<18) {
			throw new IllegalAgeException();
		}
	}
}


public class ThrowsTry {

	public static void main(String[] args) {
		Voter voter= new Voter();
		try {
			voter.register(16);
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
