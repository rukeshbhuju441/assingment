package assingment9;

public class Question37 {

	public static void main(String[] args) {
		int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrixB = { { 3, 2, 1 }, { 6, 4, 5 }, { 9, 8, 7 } };

		int row = 3;
		int column = 3;

		int[][] result = new int[row][column];

		System.out.println("Result of a matrix are: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				result[i][j] = matrixA[i][j] + matrixB[i][j];
				System.out.print(result[i][j] + " ");

			}
			System.out.println();
		}

	}

}
