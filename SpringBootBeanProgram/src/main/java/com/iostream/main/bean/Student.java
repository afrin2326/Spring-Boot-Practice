package com.iostream.main.bean;

public class Student
{
	
	private String name;
	private int rollNo;
	private float marks;
	
	public Student(String name, int rollNo, float marks)
	{
		
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll No:"+rollNo);
		System.out.println("Marks:"+marks);
	}
	
	

}
