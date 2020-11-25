package assingment8;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find fibonicci: ");
		int n = input.nextInt();

		int first = 1;
		int second = 1;

		System.out.println(first + " ");
		for (int i = 0; i <= n; i++) {
			System.out.print(second + " ");
			int temp = first + second;
			first = second;
			second = temp;
		}
		input.close();

	}

}
