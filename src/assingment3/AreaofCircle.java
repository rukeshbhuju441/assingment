package assingment3;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		final double PI = Math.PI;
		
		double radius,area;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Radius of Circle");
		radius = input.nextDouble();
		
		area = PI * radius * radius;
		
		System.out.println("Area of the Circle is " + area);
		
		input.close();
		

		
		
		
		
	}

}
