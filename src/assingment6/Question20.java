package assingment6;

import java.util.Scanner;

public class Question20 {

	public static void fourFunctionCalculator() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice: + - * / ");
		char choice = input.next().charAt(0);

		int a = 0;
		int b = 0;
		int result = 0;

		if (choice == '+' || choice == '-' || choice == '*' || choice == '/') {
			System.out.println("Enter number1: ");
			a = input.nextInt();
			System.out.println("Enter number2: ");
			b = input.nextInt();

			input.close();
		}
		switch (choice) {
		case '+':
			result = a + b;
			System.out.println("Sum is:" + result);
			break;
		case '-':
			result = a - b;
			System.out.println("Substraction is: " + result);
			break;
		case '*':
			result = a * b;
			System.out.println("Multiplication is: " + result);
			break;
		case '/':
			result = a / b;
			System.out.println("Division is :" + result);
			break;

		default:
			System.out.println("Wrong choice: ");

		}
	}

	public static void main(String[] args) {
		fourFunctionCalculator();

	}

}
