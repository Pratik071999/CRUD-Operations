package com.monocept.model;

import java.util.TreeMap;

public class TreeMapCrud {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "Pratik");
		tm.put(2, "Anuj");
		tm.put(3, "XYZ");
		tm.put(4, "ABC");

		System.out.println("ELements in map are: " + tm);
		System.out.println("-------------");

		// updating element
		tm.putIfAbsent(5, "LMN");
		System.out.println("After updating element: " + tm);
		System.out.println("-------------");

		// removing element
		tm.remove(5);
		System.out.println("After removing: " + tm);
		System.out.println("-------------");

		// retrieving
		System.out.println("Element at key 2 is:" + tm.get(2));

	}

}
