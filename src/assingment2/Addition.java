package assingment2;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number1 : ");
		int a = input.nextInt();
		System.out.println("Enter number2 : ");
		int b = input.nextInt();
		System.out.println("Enter number3 : ");
		int c = input.nextInt();
		int sum = a+b+c;
		
		
	System.out.println("Sum of "+a+" and "+b+" and "+c+" is: " + sum);
	
	input.close();
	
		
		
	}

}
