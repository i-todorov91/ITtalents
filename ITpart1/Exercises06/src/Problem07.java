
public class Problem07 {

	public static void main(String[] args) {
		
		int[][] matrix = { { 1,2,3,4 },
						   { 5,6,7,8 },
						   { 9,10,11,12 },
						   { 13,14,15,16 }
						 };
		int[][] mini = new int[2][2];
		int maxSum = 0;
		int sum = 0;
		int startI = 0;
		int startJ = 0;
		
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix.length - 1; j++) {
				sum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
				if (maxSum < sum) {
					startI = i;
					startJ = j;
				}
			}
		}
		
		System.out.println(matrix[startI][startJ] + " " + matrix[startI][startJ + 1]);
		System.out.println(matrix[startI + 1][startJ] + " " + matrix[startI + 1][startJ + 1]);
	}
}
