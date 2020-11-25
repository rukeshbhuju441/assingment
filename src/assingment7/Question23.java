package assingment7;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;

		}

		System.out.println("Sum of nth number is: " + sum);
		input.close();

	}

}
