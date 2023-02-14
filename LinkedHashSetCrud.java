package com.monocept.model;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetCrud {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Fox");
		lhs.add("Pig");
		lhs.add("Lion");
		lhs.add("Tiger");

		System.out.println("Element in the list are: " + lhs);

		// Converting LinkedHashSet to ArrayList to retrieve element
		List<String> list = new ArrayList<String>(lhs);
		System.out.println("Element at index 2 is: " + list.get(2));

		System.out.println("Size of the List is: "+lhs.size());
		
		System.out.println("After removing Pig: "+lhs.remove("Pig"));
		System.out.println(lhs);
		
		boolean is=lhs.contains("Lion");
		System.out.println(is);

	}

}
