package assingment6;

import java.util.Scanner;

public class Question16 {

	public static void findingEvenorOdd() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number to find if it is even or odd: ");
		int n = input.nextInt();
		input.close();

		if (n % 2 == 0) {
			System.out.println(n + " is an even number. ");

		} else {
			System.out.println(n + " is an odd number. ");
		}
	}

	public static void main(String[] args) {
		findingEvenorOdd();

	}

}
