package corejavaexamples;

import java.util.Scanner;

public class NCRProgram {
	
	public static int fact(int number) {
		int factorial=1;
		if(number == 1 || number == 0)
			factorial=1;
		else if(number > 0){
			for(int i=2;i<=number;i++)
				factorial=factorial*i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  n,r;
		float ncr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		n = sc.nextInt();
		System.out.println("Enter r value");
		r = sc.nextInt();
		ncr = fact(n)/ (fact(n-r) * fact(r));
		System.out.println(ncr);

	}

}
