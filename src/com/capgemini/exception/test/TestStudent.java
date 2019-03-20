package com.capgemini.exception.test;

import org.junit.Test;

import com.capgemini.exception.main.AgeNotWithinRangeException;
import com.capgemini.exception.main.NameNotOfTypeStringException;
import com.capgemini.exception.main.Student;

public class TestStudent {

	Student student;

	@Test
	public void testForAgeWithinRangeException() {
		try {
			student = new Student(1, "Ram", 19, "CSE");
		} catch (Exception e) {
			System.out.println("error");
		}
	}

	@Test(expected = AgeNotWithinRangeException.class)
	public void testForAgeNot() throws AgeNotWithinRangeException, NameNotOfTypeStringException {

		student = new Student(1, "Ram", 219, "CSE");

	}
	
	@Test
	public void testForValidName() {
		try {
			student = new Student(1, "Ram", 16, "CSE");
		} catch (Exception e) {
			System.out.println("error");
		}
	}
	
	@Test(expected = NameNotOfTypeStringException.class)
	public void testForInvalidName() throws AgeNotWithinRangeException, NameNotOfTypeStringException {
		student = new Student(1, "Ram@", 21, "CSE");

	}
	
	
}
