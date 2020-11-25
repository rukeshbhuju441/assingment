package assingment8;

import java.util.Scanner;

public class CallForQuest28 {

	public static void main(String[] args) {
		Question28 obj = new Question28();
		Scanner input = new Scanner(System.in);
		String decision = "";

		do {
			System.out.println("Enter your choice: isPrimeNumber | nthPrime | allPrime");
			String choice = input.next();
			switch (choice) {
			case "isPrimeNumber":
				System.out.println("Enter to find a prime number. ");
				int n = input.nextInt();
				boolean isPrime = obj.isPrimeNumber(n);
				if (isPrime) {
					System.out.println(n + " is a prime number.");
				} else {
					System.out.println(n + " is not a prime number.");

				}
				break;

			case "nthPrime":
				System.out.println("Enter number to find Nth Prime.");
				n = input.nextInt();
				obj.firstNthPrime(n);
				System.out.println(n + " is Nth Prime.");
				break;

			case "allPrime":
				System.out.println("Enter start number to find all prime. ");
				int start = input.nextInt();
				System.out.println("Enter end number to find all prime. ");
				int end = input.nextInt();
				obj.allPrimeBetween(start, end);
				break;

			default:
				break;
			}
			System.out.println("Do you want to continue?");
			decision = input.next();

		} while (decision.equalsIgnoreCase("Yes"));
		System.out.println("Happy Coding!!!! Bye Bye Bye......");
		input.close();
	}
}