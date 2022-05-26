package corejavaexamples;

import java.util.Scanner;

public class OddNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, sum = 0, reminder;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		while (number > 0) {
			reminder = number % 10;
			if (reminder % 2 != 0)
				sum = sum + reminder;
			
			number/=10;
		}
		System.out.println("The sum of odd numbers:"+sum);

	}

}
