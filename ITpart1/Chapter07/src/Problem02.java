
public class Problem02 {

	public static void main(String[] args) {
		
		int[][] matrix = {  { 5,3,2,6 },
							{ 5,3,1,6 },
							{ 3,9,6,2 },
							{ 2,5,1,3 }
						 };
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
		System.out.println();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i + j == matrix.length - 1) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
		
	}
}
