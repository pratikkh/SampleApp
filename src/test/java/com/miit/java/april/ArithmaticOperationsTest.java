package com.miit.java.april;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.google.errorprone.annotations.MustBeClosed;

public class ArithmaticOperationsTest {
	ArithmaticOperations a = new ArithmaticOperations();
	
	@BeforeClass
	public static void inititalizeTestClass() {
		String s = App.test;
		System.out.println("BeforeClass Entering");
		System.out.println("BeforeClass Exiting");
	}
	
	@Before
	public void callBeforeMethod() {
		System.out.println("Before Entering");
		System.out.println("Before Exiting");
	}
	
	
	@Test
	public void testAddIntInt() {
		
		int expected = 5;
		int actual = a.add(2, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	@Ignore
	public void testNegativeAddIntInt() {
		//get(1)'
		//if name == PRatik
		ArithmaticOperations a = new ArithmaticOperations();
		int expected = 1;
		int actual = a.add(-2, 3);
		assertEquals(expected, actual);
	}
	
	@After
	public void afterMethod() {
		System.out.println("After Entering");
		System.out.println("After Exiting");
	}
	
	@AfterClass
	public static void afterAllMethod() {
		System.out.println("AfterAll Entering");
		System.out.println("AfterAll Exiting");
	}
	

}
