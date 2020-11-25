package assingment3;

import java.util.Scanner;

public class Question10a {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter s");
		double s = input.nextDouble();
		System.out.println("Enter u");
		double u = input.nextDouble();
		System.out.println("Enter t");
		double t = input.nextDouble();
		System.out.println("Enter a");
		double a = input.nextDouble();
		
		
		s = u* t + 0.5 + a * t+ t;
		
		System.out.println("s is :"+ s);

		input.close();
		

	}

}
