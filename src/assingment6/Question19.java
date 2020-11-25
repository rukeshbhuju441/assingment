package assingment6;

import java.util.Scanner;

public class Question19 {

	public static void findTriangleType() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side a: ");
		int a = input.nextInt();
		System.out.println("Enter Side b: ");
		int b = input.nextInt();
		System.out.println("Enter side c: ");
		int c = input.nextInt();

		if ((a + b < c) || (a + c < b) || (c + b < a)) {
			System.out.println("Invalid Triangle ");
		} else if ((a == b) && (b == c)) {
			System.out.println("Equilateral Triangle");
		} else if ((a == b) || (b == c) || (c == a)) {
			System.out.println("Isoceles Triangle");
		} else {
			System.out.println("Scalene Triangle");

			input.close();

		}
	}

	public static void main(String[] args) {
		findTriangleType();

	}

}
