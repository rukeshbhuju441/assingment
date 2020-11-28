package assingment7;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number of Student: ");
		int numOfStudent = input.nextInt();

		int maxScore = 0;
		String studentName = "";

		for (int i = 1; i <= numOfStudent; i++) {
			System.out.println("Enter a Name of a Student: ");
			String name = input.next();
			System.out.println("Enter a Score of a Student: ");
			int score = input.nextInt();
			if (score > maxScore) {
				maxScore = score;
				studentName = name;

			}
		
		}

		System.out.println("Student Name is:" + studentName);
		System.out.println("MaxScore is: " + maxScore);

	}

}
