package assingment3;

import java.util.Scanner;

public class PerimeterofTriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		double sidea, base, sideb, perimeter;
		
		System.out.println("Side a of the Triangle");
		sidea = input.nextDouble();
		System.out.println("Side b of the Triangle");
		sideb = input.nextDouble();
		System.out.println("Base of the Triangle");
		base = input.nextDouble();
		
		perimeter = sidea + sideb + base;
		
		System.out.println("Perimeter of Triangle :" + perimeter);
		input.close();
		
		

	}

}
