package com.deloitte.collection;
import java.util.ArrayDeque;
public class Assignment2Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> adq = new ArrayDeque<String>();
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		
		System.out.println("popping the stack");
		
		while(adq.peek() != null)
			System.out.println(adq.pop() + "");
		System.out.println();
		

	}

}
