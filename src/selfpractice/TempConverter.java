package selfpractice;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter choice 1 to convert from Fahrenheit to Celcius.");
		System.out.println("Enter choice 2 to convert from Celcius to Fahrenheit.");

		int choice = input.nextInt();

		double temprature = 0.0;
		double converted = 0.0;

		if (choice == 1)

		{
			System.out.println("Enter the temprature in Fehrenheit");
			temprature = input.nextDouble();
			converted = (temprature - 32) * 5 / 9;
			System.out.println("Temprature in Celcius is:" + converted);

		} else if (choice == 2) {
			System.out.println("Enter the temprature in Celcius");
			temprature = input.nextDouble();
			converted = (temprature * 9 / 5) + 32;
			System.out.println("Temprature in Fehrenheit is:" + converted);

		}

		else
			System.out.println("Wrong Input. Please try again.");

		input.close();

	}

}
