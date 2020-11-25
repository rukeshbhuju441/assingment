package assingment3;

import java.util.Scanner;

public class VolumeofCylinder {

	public static void main(String[] args) {
		double radius, length, volume;

		final double PI = Math.PI;

		Scanner input = new Scanner(System.in);
		System.out.println("Radius of Cylinder");
		radius = input.nextDouble();
		System.out.println("length of Cylinder");
		length = input.nextDouble();

		volume = radius * radius * PI * length;

		System.out.println("The volume is:" + volume);

		input.close();

	}

}
