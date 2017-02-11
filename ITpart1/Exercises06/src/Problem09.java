
public class Problem09 {

	public static void main(String[] args) {
		
		int n = 6;
		int m = 5;
		
		int[][] matrix = new int[n][m];
		
		int num = 1;
		
		for (int i = 0; i < matrix.length; i++) {
			
			if (i == 0) {
				matrix[i][0] = num;
				num++;
			}
			if (i > 0 && i < matrix.length - 1) {
				for (int j = 0, k = i; j <= i; j++, k--) {
					matrix[k][j] = num;
					num++;
				}
			}
			if (i == matrix.length - 1) {
				int start = 0;
				while (start < m) {
					for (int j = start, k = i; j < m && k >= 0; j++, k--) {
						matrix[k][j] = num;
						num++;
					}
					start++;
				}			
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
