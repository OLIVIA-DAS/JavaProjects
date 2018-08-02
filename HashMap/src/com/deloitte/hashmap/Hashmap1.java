package com.deloitte.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class Hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> result = new HashMap<Integer, String>();
		
		result.put(123,"ABC");
		result.put(345,"EFG");
		result.put(678,"HIJ");
		result.put(345,"ABC");
		
		System.out.println(result.size());
		System.out.println(result.get(345));
		
		Set<Integer> keys = result.keySet();
		
		for(Integer key:keys) {
			System.out.println(keys + "-" + result.get(key));
		}
		
		Iterator<Integer> iterator = keys.iterator();
		Integer key;
		while(iterator.hasNext()) {
			key=iterator.next();
			System.out.println(key + "-" + result.get(key));
			
		}
		
			

	}

}
