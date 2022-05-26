package corejavaexamples;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, reverse=0, reminder;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		while(number >0) {
			reminder = number%10;
			reverse = reverse*10+reminder;
			number/=10;
		}
		System.out.println("The reverse: "+reverse);
	}

}
