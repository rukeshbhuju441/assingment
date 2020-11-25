package assingment9;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the elements you want : ");
		int size = input.nextInt();
		
		int arr[] = new int[size];			
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter all the elements:");
			arr[i] = input.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) { //int j = i+1 on video Question for logic
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("Ascending Order for element of an array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			input.close();
		}
	}

}
