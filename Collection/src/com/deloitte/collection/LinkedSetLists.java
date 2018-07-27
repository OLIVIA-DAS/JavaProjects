package com.deloitte.collection;

import java.util.Collection;
import java.util.HashSet;

class DBAccess{
	public Collection<String> getResult() {
		HashSet<String> result = new HashSet<String>();
		
		result.add("B");
		result.add("A");
		result.add("C");
		result.add("D");
		result.add("A");
		
		return result;
	}
}

public class LinkedSetLists {

	public static void main(String[] args) {
		DBAccess dba = new DBAccess();
		Collection<String> result = dba.getResult();
		for (String tar: result) {
			System.out.println(tar);
		}
		
		

	}

}
