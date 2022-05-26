package com.examples.java;

public class TestBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box2D b1 = new Box2D();
		b1.calArea();  // 
		System.out.println(b1);
		Box2D b2 = new Box2D(5,5);
		b2.calArea();  // 0, 25 
		System.out.println(b2);

	}

}
