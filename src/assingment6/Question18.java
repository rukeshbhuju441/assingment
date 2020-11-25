package assingment6;

public class Question18 {

	public static void findingGreaterNumber() {
		int a = 2991;
		int b = 9990;
		int c = 9999;

		if (a > b) {
			if (a > c && b > c && b > a) {
				System.out.println("a is greater number.");
			} else {
				System.out.println("b is greater number.");
			}
		} else {
			System.out.println("a is smaller than b also smaller than c. ");
		}
	}

	public static void main(String[] args) {

		findingGreaterNumber();
		;

	}

}
