package assingment8;

import java.util.Scanner;

public class CallFor29 {

	public static void main(String[] args) {
		
		Question29 ob = new Question29();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find series sum. ");
		int n = input.nextInt();
		int sum = ob.printSeriesSum(n);
		System.out.println("Nth series sum is: " + sum);

		input.close();

	}

}
