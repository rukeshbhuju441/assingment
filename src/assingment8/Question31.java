package assingment8;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
		input.close();
	}

}
