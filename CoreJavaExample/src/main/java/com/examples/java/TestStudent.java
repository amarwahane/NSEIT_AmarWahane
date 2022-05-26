package com.examples.java;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		Student stu1 = new Student("Praveen","CSE");
		stu1.PrintData();
		Student stu2 = new Student("Kumar","Civil");
		stu2.PrintData();
		
		Student stu3 = new Student();
		stu3.PrintData();
		
		*/
		ThisExample t1 = new ThisExample();
		t1.showDetails();
		
		ThisExample t2 = new ThisExample("Kishore","Bangalore");
		t2.showDetails();
	}

}
// TestStudent t = new TestStudent();
// t.main();
