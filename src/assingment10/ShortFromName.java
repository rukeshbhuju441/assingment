package assingment10;

import java.util.Scanner;
import java.io.*;

public class ShortFromName {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your Name: ");
		String firstname = br.readLine();

		System.out.println("Enter middle name: ");
		String middlename = br.readLine();

		System.out.println("Enter your last name: ");
		String lastname = br.readLine();

		System.out.println("Abbreviated Name: " + firstname+ middlename+ lastname);

	}
}
