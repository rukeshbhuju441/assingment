package assingment10;

public class PalindromeTest {
	// Java implementation of the approach Function that returns true if string is a palindrome
	boolean isPalindrome(String str) {

		// Pointers pointing to the beginning and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters to compare
		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;

			// Increment first pointer and decrement the other
			i++;
			j--;
		}

		// Given string is a palindrome
		return true;
	}

	public void main(String[] args) {
		String str = "geeks";

		if (isPalindrome(str))
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}
