package com.monocept.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExcep {

	public static void main(String[] args) {
		try {
			File f=new File("F:\\f1.txt");
			FileReader fr=new FileReader(f);
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}

	}

}
