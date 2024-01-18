package com.itp;

public class Student {
	
	private int rollno;
	private String fname;
	private String lname;
	private char section;
	private float fees;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String fname, String lname, char section, float fees) {
		super();
		this.rollno = rollno;
		this.fname = fname;
		this.lname = lname;
		this.section = section;
		this.fees = fees;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}
	
	
	
	

}
