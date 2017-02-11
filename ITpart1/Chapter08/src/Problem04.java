import java.util.Arrays;

public class Problem04 {

	public static void main(String[] args) {
		
		int row = 6;
		int col = 3;
		
		int[][] matrix = matrixGen(row, col);
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	static int[][] matrixGen(int a, int b){
		int[][] matrix = new int[a][b];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = 0;
			}
		}
		
		return matrix;
	}
	
}
