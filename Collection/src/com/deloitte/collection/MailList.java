package com.deloitte.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

class Address {
	private String name; 
	private String street; 
	private String city; 
	private String state; 
	private String code;
	private int i;
	
	Address(String n, String s, String c, String st , String cd , int i){
		name = n;
		street= s;
		city = c;
		state= st;
		code= cd;
		this.i = i;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "\n" + street + "\n" + city + " " + state + " " + code + " " + i;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!= null) {
			if(obj instanceof Address) {
				Address add=(Address)obj;
				if(i==add.i && name== add.name && street== add.street && city == add.city && state == add.state && code == add.code)
				{
					return true;
				}	
			}
		}
		// TODO Auto-generated method stub
		return false ;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i;
	}
}

public class MailList {

	public static void main(String[] args) {
		HashSet<Address> m1 = new HashSet<Address>();
		m1.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801", 1));
		m1.add(new Address("Ralph Baker", "1142 Maple lane", "Malhome", "IL", "61853", 2));
		m1.add(new Address("Tom carlton", "867 Elm st", "Champaign", "IL", "61820", 3));
		m1.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801", 1));
		
		Iterator<Address> itr = m1.iterator();
		while(itr.hasNext()) {
			Address element = itr.next();
			System.out.println(element + " ");
		}
		

	}
	

}
