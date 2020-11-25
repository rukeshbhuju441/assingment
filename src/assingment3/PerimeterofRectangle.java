package assingment3;

import java.util.Scanner;

public class PerimeterofRectangle {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double breadth;
	double perimeter;
	
	System.out.println("Length of Rectangle");
	double length = input.nextDouble();
	System.out.println("Breath of Rectangle");
	breadth  = input.nextDouble();
	
	perimeter = 2 * (length + breadth);
	
	System.out.println("Perimeter of Rectangle is:" + perimeter);

	
	input.close();
	
	

	}

}
