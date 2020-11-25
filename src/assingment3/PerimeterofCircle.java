package assingment3;

import java.util.Scanner;

public class PerimeterofCircle {

	public static void main(String[] args) {
		final double PI = Math.PI;
		Scanner input = new Scanner(System.in);
		Double radius,perimeter;
		
		
		
		System.out.println("Radius of Circle");
		radius = input.nextDouble();
		
		
		perimeter = 2 *PI * radius;
		
		System.out.println("Perimeter of Circle is :" + perimeter);
		input.close();
		

	}

}
