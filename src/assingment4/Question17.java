package assingment4;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = 2028;
		
		
		if (year % 400==0) {
			System.out.println(year + " is a leap year. ");
		
		}
		else if(year%4==0 && year%100!=0) {
			System.out.println(year + " is a leap year.");
		
		}
		else {
			System.out.println(year + " is not a leap year.");
		
		}
	
	input .close();
	
		}
	

	}