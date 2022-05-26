package com.examples.java;

class OverloadingClass {
	public void test(int x, int y) {
		System.out.println("Inside two int variable method..");
	}

	public int test(int x) {
		System.out.println("Inside one int variable method..");
		return 0;
	}

	public String test(int x, int y, int z) {
		System.out.println("Inside three int variable method..");
		return null;
	}

	public void test(int x, char ch) {
		System.out.println("Inside one int and one char variable method..");
	}
}

public class OverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingClass c1 = new OverloadingClass();
		c1.test(10);
		c1.test(10,20);
		c1.test(10,20,40);
		c1.test(10,'C');
	}

}
