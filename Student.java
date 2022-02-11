package com.app.core;

public class Student extends Person {
	private int gradYear;
	private String course;
	private double fees;
	private int marks;
	private int age;
	private int m;
	private int n;

	// add a parameterized constr to init complete state of a Student
	public Student(String firstName, String lastName, int gradYear, String course, double fees, int marks,int n) {
		super(firstName, lastName);// explicitly invoking immediate super cls's MATCHING constructor
		System.out.println("in student ctor");
		System.out.println("Just for fun");
		this.gradYear = gradYear;
		this.course = course;
		this.fees = fees;
		this.marks = marks;
		this.n = n;



	}

	// modifying the inherited method toString
	public String toString() {
//  welcome 
		return "Student " + super.toString() + " graduated in" + gradYear + " course : " + course + " fees " + fees
				+ " marks " + marks;

	}

}
