package assingment2;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Principal");
		double p = input.nextDouble();
		System.out.println("Enter Interest");
		double i = input.nextDouble();
		System.out.println("Enter Rate");
		double r = input.nextDouble();
	
		
	double si = p * i * r / 100;
		System.out.println("SimpleInterest is: "+ si);
		
		input.close();
		
		
		
	}

}
