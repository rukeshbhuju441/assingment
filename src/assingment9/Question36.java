package assingment9;

import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a size: ");
		int size = input.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter an element: ");
			arr[i] = input.nextInt();

		}

		System.out.println("Elements that are duplicate: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}
			}
		}

		input.close();
	}

}
