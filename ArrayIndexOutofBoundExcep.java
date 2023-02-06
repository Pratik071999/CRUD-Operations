package com.monocept.test;

public class ArrayIndexOutofBoundExcep {

	public static void main(String[] args) {
		try {
			int[]a=new int[6];
			a[7]=9;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is out of bounds ");
		}
	

	}

}
