package selfpractice;

public class Question35 {

	public static void main(String[] args) {
		int arr[] = { 18, 25, 26, 28, 89, 69, 99 };
		int largest = arr[0];
		int secondLargest = arr[0];

		System.out.println("The given array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];

			}
		}

		System.out.println("Second largest number is: " + secondLargest);

	}
}