package com.deloitte.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Assignment4 {

	public static void main(String[] args) {
		 Vector<Integer> v = new Vector<Integer>(3, 2); 
		 
		    System.out.println("Initial size: " + v.size()); 
		    System.out.println("Initial capacity: " + 
		                       v.capacity()); 
		 
		    v.addElement(1); 
		    v.addElement(2); 
		    v.addElement(3); 
		    v.addElement(4); 
		 
		    System.out.println("Capacity after four additions: " + 
		                       v.capacity());
		    v.addElement(5);
		    System.out.println("Current capacity: " + 
		                       v.capacity());
		    v.addElement(6);
		    v.addElement(7);
		 
		    System.out.println("Current capacity: " + 
		    		 v.capacity());
		    v.addElement(8);
		    v.addElement(9);
		 
		    System.out.println("Current capacity: " + 
		                       v.capacity()); 
		    v.addElement(7); 
		    v.addElement(8); 
		 
		 
		    System.out.println("First element: " + v.firstElement()); 
		    System.out.println("Last element: " + v.lastElement()); 
		 
		    if(v.contains(3))
		      System.out.println("Collection contains 3."); 
		 
		    // traverse through the elements in the collection. 
		   Enumeration vE = v.elements();
		 
		    System.out.println("\nElements in collection:"); 
		    while(vE.hasMoreElements())
		      System.out.print(vE.nextElement() + " "); 
		    System.out.println();


		// TODO Auto-generated method stub

	}

}
