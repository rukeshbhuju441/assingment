package assingment5;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to print table: ");
		int n = input.nextInt();

		for (int i = 1; i <= 10; i++) {
			int r = n * i;
			System.out.println(n + "*" + i + "= " + r);

		}
		input.close();

	}

}
