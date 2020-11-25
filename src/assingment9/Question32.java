package assingment9;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter size for an array:");
		int size = input.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter your elements: ");
			arr[i] = input.nextInt();

		}

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println("Sum of an array elements is: " + sum);
		input.close();

	}

}
