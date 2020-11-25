package assingment5;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice to find which day it is? ");
		int choice = input.nextInt();
		
		input.close();
		
		switch (choice) {
		
		case 1:
			System.out.println("It is Sunday!: ^_^ ");
			break;
		case 2:
			System.out.println("It is Monday: -_- ");
			break;
		case 3:
			System.out.println("It is Tuesday: +_+ ");
			break;
		case 4:
			System.out.println("It is Wednesday: ^.^ ");
			break;
		case 5:
			System.out.println("It is Thursday: *..* ");
			break;
		case 6:
			System.out.println("It is Friday!! Yay!!: ^._.^ ");
			break;
		case 7:
			System.out.println("It is Saturday!! More Yay!!: ^=^ ");
			break;
			
			default:
				System.out.println("You choose Invalid option: ");
				break;
								
		}

		System.out.println("more code: ");
		System.out.println("End and Exit: ");
		
		
	}

}
