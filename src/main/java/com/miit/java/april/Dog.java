package com.miit.java.april;

public class Dog extends Animal {

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "Barks";
	}
	@Override
	public String walk() {
		// TODO Auto-generated method stub
		return "Runs";
	}
	
	void printNumberOfLegs() {
		
		System.out.println(numberOdLegs);
		System.out.println(talk());
	}
}
