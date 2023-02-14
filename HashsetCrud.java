package com.monocept.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashsetCrud {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();

		// Adding elements into HashSet
		// using add() method
		h.add("India");
		h.add("Australia");
		h.add("South Africa");

		// Adding duplicate elements
		h.add("India");
		
		//returns size of the hashset
		System.out.println("Size of the Hashset is: "+h.size());

		// Displaying the HashSet
		System.out.println("Element in hashset: " + h);
		System.out.println("List contains India or not:" + h.contains("India"));

		// Converting HashSet to ArrayList to retrieve element
		List<String> list = new ArrayList<String>(h);
		System.out.println("Element at index 3 is: " + list.get(2));

		// deleting element
		h.remove("Australia");
		System.out.println("After removing: " + h);
	
		
		

	}

}
