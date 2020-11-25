package assingment7;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int originalNumber = input.nextInt();

		int sum = 0;
		int mul = 1;

		System.out.println("Original number is: " + originalNumber);
		while (originalNumber != 0) {
			int temp = originalNumber % 10;
			sum = sum + temp;
			mul = mul * temp;
			originalNumber = originalNumber / 10;

		}
		System.out.println("Sum of digit is: " + sum);
		System.out.println("Multiplication of digit is: " + mul);
		input.close();


	}

}
