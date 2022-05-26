package com.examples.java;

enum Color {
    RED,
    GREEN,
    BLUE;
}
enum WeekDays{
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THRUSDAY,
	FRIDAY,
	SATURDAY
}

public class TestColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(Color c: Color.values()) {
			System.out.println(c);
		}
		Color temp = Color.BLUE;
		System.out.println(temp);
		
		WeekDays d1 = WeekDays.MONDAY;
		System.out.println(d1.ordinal());
		System.out.println(d1.valueOf("SUNDAY"));

	}

}
