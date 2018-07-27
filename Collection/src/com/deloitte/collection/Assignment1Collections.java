package com.deloitte.collection;

import java.util.LinkedList;

public class Assignment1Collections {

	public static void main(String[] args) {
	{
			
		
		LinkedList<String> result = new LinkedList<String>();
		result.add("B");
		result.add("C");
		result.add("D");
		result.add("X");
		result.add("Y");
		result.addLast("Z");
		result.addFirst("A");
		
		result.add(1, "A");
		System.out.println("Original Content of result:" + result);
		
		result.remove("F");
		result.remove(2);
		System.out.println("Contents of result after deletion" + result);
		
		result.removeFirst();
		result.removeLast();
		System.out.println("Contents after deleting first and last" + result);
		
		
		String val = result.get(2);
		result.set(2, val + "Changed");
		System.out.println("result after changed" + result);
		
		}
		// TODO Auto-generated method stub

	}

}
