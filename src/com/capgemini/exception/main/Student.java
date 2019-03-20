package com.capgemini.exception.main;

import java.util.regex.Pattern;

public class Student {
	private int rollNumber;
	private String name;
	private int age;
	private String course;

	public Student(int rollNumber, String name, int age, String course) throws AgeNotWithinRangeException,  NameNotOfTypeStringException {
		super();
		this.rollNumber = rollNumber;
		if(Pattern.matches("[a-zA-Z]+", name))
			this.name = name;
		else 
			throw new  NameNotOfTypeStringException("Name entered is not valid");
		if(age < 15 | age > 21)
			throw new AgeNotWithinRangeException("Age should be between 15 and 21");
		else
			this.age = age;
		this.course = course;
	}

	public Student() {
		super();

	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	
	

}
