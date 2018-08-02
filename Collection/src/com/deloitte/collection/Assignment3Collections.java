package com.deloitte.collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment3Collections {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("C");
		a1.add("A");
		a1.add("E");
		a1.add("B");
		a1.add("D");
		a1.add("F");
		System.out.println("Original conetnts of a1:");
		Iterator<String> itr = a1.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.println(element + " ");
			
		}
		System.out.println();
		ListIterator<String> litr = a1.listIterator();
		while(litr.hasNext()) {
			
		String element = litr.next();
		litr.set(element + "+");
		
		}
		System.out.println("Modified contents of a1:");
		itr = a1.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.println(element + " ");
		}
		System.out.println();
		
		System.out.println("Modified list backwards:");
		
		while(litr.hasPrevious()) {
			String element = litr.previous();
			System.out.println(element + " ");
			
		}
			System.out.println();
		// TODO Auto-generated method stub

	}

}
