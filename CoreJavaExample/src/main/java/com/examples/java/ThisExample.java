package com.examples.java;

public class ThisExample {
	
	String name;
	String location;
	public ThisExample(String name, String location) {
		System.out.println("Inside the parameterized constructor");
		showDetails();
		this.name = name;
		this.location = location;
	}
	public ThisExample() {
		this("kish","mum");
		System.out.println("Inside the default constructor");
		
		name="Anil";
		location="Chennai";
	}
	public void showDetails() {
		
		System.out.println("Name: "+name+" "+"location: "+location);
	}

}
