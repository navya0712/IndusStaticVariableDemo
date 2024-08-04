package com.indus.training.core;

import junit.framework.TestCase;

/**
 * Provides Test Case for Student Class
 */
public class TestStudent extends TestCase {

	/**
	 * Sets Up the test environment
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test Case to verify the staticness of the variables teacher and grade
	 */
	public void testScenario1() {
		Student studentObj1 = new Student("Navya", "Bade", "188T1A0506");
		studentObj1.setTeacher("Ravikanth");
		studentObj1.setGrade("10");
		System.out.println(studentObj1.toString());
		System.out.println("Student [" + studentObj1.getTeacher() + ", " + studentObj1.getGrade() + "]");
		Student studentObj2 = new Student("Nitya", "Bade", "188T1A0501");
		studentObj2.setTeacher("Ravikanth");
		studentObj2.setGrade("10");
		System.out.println(studentObj2.toString());
		System.out.println("Student [" + studentObj2.getTeacher() + ", " + studentObj2.getGrade() + "]");
		Student studentObj3 = new Student("Aaradhya", "Bade", "188T1A0502");
		studentObj3.setTeacher("Ravikanth");
		studentObj3.setGrade("10");
		System.out.println(studentObj3.toString());
		System.out.println("Student [" + studentObj3.getTeacher() + ", " + studentObj3.getGrade() + "]");
		Student studentObj4 = new Student("Dhruthi", "Bade", "188T1A0503");
		studentObj4.setTeacher("Ravikanth");
		studentObj4.setGrade("10");
		System.out.println(studentObj4.toString());
		System.out.println("Student [" + studentObj4.getTeacher() + ", " + studentObj4.getGrade() + "]");
		Student studentObj5 = new Student("Aadya", "Bade", "188T1A0503");
		studentObj5.setTeacher("Vijay");
		studentObj5.setGrade("10");
		System.out.println(studentObj5.toString());
		System.out.println("Student [" + studentObj5.getTeacher() + ", " + studentObj5.getGrade() + "]");

	}

}
