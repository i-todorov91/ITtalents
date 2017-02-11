
public class Problem07 {

	public static void main(String[] args) {

		int[][] matrix = { { 11, 12, 13, 14, 15, 16 },
						   { 21, 22, 23, 24, 25, 26 },
						   { 31, 32, 33, 34, 35, 36 },
						   { 41, 42, 43, 44, 45, 46 }, 
						   { 51, 52, 53, 54, 55, 56 }, 
						   { 61, 62, 63, 64, 65, 66 } 
						 };

		int sum = 0;
		int total = 0;
		int n = 6; // the rows and columns of the matrix
		int br = 0;

		for (int i = 0; i < n * n; i++) {
			if (i / 6 % 2 == 0 && i % 2 == 0) {
				System.out.print(matrix[i / n][i % n] + " ");
				br++;
				sum += matrix[i / n][i % n];
			} else if (i / 6 % 2 == 1 && i % 2 == 1) {
				System.out.print(matrix[i / n][i % n] + " ");
				br++;
				sum += matrix[i / n][i % n];
			}
			if (br == n / 2 && i != 0) {
				total += sum;
				System.out.print("The sum of this row is: " + sum);
				sum = 0;
				br = 0;
				System.out.println();
			}
		}
		System.out.println("The total is " + total);

	}
}
