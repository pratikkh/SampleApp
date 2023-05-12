package com.miit.java.april;

public class AdditionOperation extends ArithmaticOperations {

	public double add(double a, double b, double c) {
		System.out.println("Method from child executed");
		return a+b+c;
	}

}
