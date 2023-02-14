package com.monocept.model;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetCrud {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();

		// adding elements
		ts.add("Grapes");
		ts.add("Pineapple");
		ts.add("Mangoo");
		ts.add("Banana");

		// displaying
		System.out.println("Element in the set are: " + ts);

		// returns size of set
		int size = ts.size();
		System.out.println("Size of set is: " + size);

		// retrieve element
		// Converting LinkedHashSet to ArrayList to retrieve element
		List<String> list = new ArrayList<String>(ts);
		System.out.println("Element at index 2 is: " + list.get(2));

		// deleting element
		System.out.println("After removing element: " + ts.remove("Banana"));
		System.out.println(ts);

		// returns true if particular element is present
		boolean isthere = ts.contains("Grapes");
		System.out.println("Is there Grapes in list: " + isthere);

	}

}
