package assingment9;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements in the array: ");
		int size = input.nextInt();

		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter an element: ");
			arr[i] = input.nextInt();

		}
		System.out.println("Original order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

		System.out.println();
		System.out.println("Reverse order: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
