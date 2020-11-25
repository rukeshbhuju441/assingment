package assingment3;

import java.util.Scanner;

public class PoundtoKg {

	public static void main(String[] args) {
		double pounds;
		double kilograms;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number in pounds");
		pounds = input.nextDouble();
		
		kilograms = pounds * 0.454;
		
		System.out.println("Kilograms is: " + kilograms + "kg");
		
		input.close();
		
		
	}

}
