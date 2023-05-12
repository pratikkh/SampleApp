package com.miit.java.april;

import java.io.*;

public class BISExample {

	public static void main(String args[]) {
		try (FileInputStream fin = new FileInputStream("C:\\Users\\khand\\Desktop\\sample.txt");
				BufferedInputStream bin = new BufferedInputStream(fin);) {
			int i;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
			bin.close();
			fin.close();
		    
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Generic Output");
		} 
		//continue processing.s
	}
}
