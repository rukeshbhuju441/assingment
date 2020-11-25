package assingment6;

import java.util.Scanner;

public class Question17 {

	public static void findLeapYear() {
		Scanner input = new Scanner(System.in);
		int year = 2019;
		input.close();

		if (year % 400 == 0) {
			System.out.println(year + " is a leap year ");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " is a leap year. ");
		} else {
			System.out.println(year + " is not a leap year. ");

		}

		System.out.println("More code. ");

	}

	public static void main(String[] args) {
		findLeapYear();
		System.out.println("Main Method Ends Here. ");

	}
}
