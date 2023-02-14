package com.monocept.model;

import java.util.LinkedHashMap;

public class LinkedHashMapCrud {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

		lhm.put(1, "Tv");
		lhm.put(2, "Radio");
		lhm.put(3, "Speakers");
		lhm.put(4, "Phone");

		System.out.println("After adding element into map: " + lhm);
		System.out.println("-------------");

		// updating the map by adding value in it
		lhm.putIfAbsent(5, "Headphone");
		System.out.println("After invoking putIfAbsent() method ");
		System.out.println(lhm);
		System.out.println("-------------");

		// removing element
		lhm.remove(5);
		System.out.println("After removing: " + lhm);
		System.out.println("-------------");

		// retrieving
		System.out.println("Element at key 1 is:" + lhm.get(1));
		
		//deleting all elements in map
		lhm.clear();
		System.out.println(lhm);

	}

}
