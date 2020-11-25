package assingment7;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();

		int i, fact = 1;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial number " + number + " is " + fact);
		input.close();

	}

}
