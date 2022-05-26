package corejavaexamples;

import java.util.Scanner;

public class FibnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, series1 = -1, series2 = 1, nextNumber;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		nextNumber = series1 + series2;
		while (nextNumber <= number) {
			System.out.print(nextNumber+" ");
			series1 = series2;
			series2 = nextNumber;
			nextNumber = series1 + series2;
		}

	}

}
