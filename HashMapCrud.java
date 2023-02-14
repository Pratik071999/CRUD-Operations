package com.monocept.model;

import java.util.HashMap;
import java.util.Map;

public class HashMapCrud {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Pratik");
		hm.put(2, "Anuj");
		hm.put(3, "Pranoy");
		hm.put(4, "ABC");

		System.out.println("Iterating Hashmap...");
		System.out.println(hm);
		System.out.println("-------------");
		
		//updating the map by adding value in it
		hm.putIfAbsent(5, "XYZ");
		System.out.println("After invoking putIfAbsent() method ");
		System.out.println(hm);
		System.out.println("-------------");
		
		//removing element
		hm.remove(5);
		System.out.println("After removing: "+hm);
		System.out.println("-------------");
		
		//retrieving
		System.out.println("Element at key 1 is:"+hm.get(1));

	}

}
