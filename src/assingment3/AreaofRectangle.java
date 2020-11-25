package assingment3;

import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		
		double length,width,area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lenght of circle");
		length = input.nextDouble();
		System.out.println("width of circle");
		width = input.nextDouble();
		
		area = length * width;
		
		System.out.println("Area of Rectangle is :"+ area);
		
		input.close();
		
				
	}

}
