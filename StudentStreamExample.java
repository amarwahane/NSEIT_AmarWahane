package com.assignment.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Write a program to display the name of students who has marks greater than 80 by using stream filter method.

class Students{
	String name;
	int marks;
	public Students(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Name:"+name+", Marks: "+marks+"\n";
	}
	
}

public class StudentStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Students> std=new ArrayList();
		std.add(0, new Students("Amar",80));
		std.add(1, new Students("Sanket",85));
		std.add(2, new Students("Nagesh",60));
		std.add(3, new Students("Payal",90));
		std.add(4, new Students("Akshay",89));
		
//		Stream s1=((Collection<Students>) std).stream();
		//make stream
		Stream s=std.stream();
		
		//create predicate interface for condition by passing student object
		
		Predicate<Students> p1= x->x.marks>80;
		
		//create new list to store the result
		List<Students> data3=(List<Students>)s.filter(p1).collect(Collectors.toList());
		System.out.println(data3);

	}

}
