package com.examples.java;

public class Student {
	int htno;
	String name;
	String branch;
	
	Student(){
		System.out.println("Inside the default constuctor");
		name="Anil";
		branch="ECE";
	}
	
	Student(String n, String b){
		System.out.println("Inside the parameterized constuctor");
		name=n;
		branch=b;
	}
	public void getData() {
		System.out.println("Inside get data method.");
	}
	public void PrintData() {
		System.out.println("Name: "+name+ " "+"Branch: "+branch);
	}
	
}
