package assingment3;

import java.util.Scanner;

public class Question11a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b :");
		int b = input.nextInt();
		System.out.println("Before swapping a is: " + a);//5
		System.out.println("Before swapping b is: " + b);//6
		
		int temp = a;//5
		a = b;//6
		b = temp;//5
		
		System.out.println();
		System.out.println("After swapping a is: " + a);//6
		System.out.println("After swapping b is: " + b);//5

		input.close();
		
	}




	}

