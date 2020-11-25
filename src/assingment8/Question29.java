package assingment8;

public class Question29 {

	public int findFactorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		return fact;
	}

	public int printSeriesSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (i / findFactorial(i));

		}
		return sum;
	}
}
