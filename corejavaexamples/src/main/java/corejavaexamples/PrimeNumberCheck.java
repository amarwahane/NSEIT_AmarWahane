package corejavaexamples;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, index;
		boolean isPrime=true;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for(int i=2;i<=number-1;i++)
		{
			if(number%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println("It is a prime number");
		else
			System.out.println("not a prime number");

	}

}
