package com.tns.inheritance;

public class Student extends Citizen{
	private int rollno;
	private String college;
	public Student() {
		System.out.println("welcome");
	}
	public Student(int rollno,String collegename) {
		this.rollno=rollno;
		this.college=college;
		
	}
	public Student(String name,long adharno, String address,long phno)
	{
		super(name,adharno,address, phno);
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", college=" + college + "]";
	}
	
}
