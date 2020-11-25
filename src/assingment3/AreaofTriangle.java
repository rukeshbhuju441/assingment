package assingment3;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double basewidth,height,area;
		
		System.out.println("Basewidth of triangle");
		basewidth = input.nextDouble();
		System.out.println("Height of triangle");
		height = input.nextDouble();
		
		area = (basewidth * height)/ 2;
		
		System.out.println("Area of Triangle is:" + area);
		input.close();
		
		

	}

}
