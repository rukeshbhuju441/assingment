package assingment4;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		if (a == b) {
		System.out.println("a and b are equal ");
		
		}
		
		if (a > b) {
			System.out.println("a is greater than b ");
			
		}
		
		if (a < b) {
			System.out.println("a is smaller than b ");
			
			input.close();
			
		}

	}
	
	
}
	
