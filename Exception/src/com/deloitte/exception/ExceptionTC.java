package com.deloitte.exception;


public class ExceptionTC {

	public static void main(String[] args) {
		
		try {
		System.out.println( Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
		System.out.println("end of try");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Put 2 valid numbers");
		}
		catch(NumberFormatException e) {
			System.out.println("put valid numbers");
		}
		catch(ArithmeticException e) {
			System.out.println("cant divide by 0");
		}
		System.out.println("EOP");
	}

}
