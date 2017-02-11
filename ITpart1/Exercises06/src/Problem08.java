
public class Problem08 {

	public static void main(String[] args) {
		
		int n = 4;
		int m = 5;
		
		int[][] matrix = new int[n][m];
		
		int num = 1;
		
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[j][i] = num;
				num++;
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
