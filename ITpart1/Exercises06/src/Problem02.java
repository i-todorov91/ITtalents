
public class Problem02 {

	public static void main(String[] args) {
		
		int[][] matrix = { { 1,2,3,4 },
						   { 5,6,7,8 },
						   { 9,10,11,12 },
						   { 13,14,15,16 }
						 };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		int rowSum = 0;
		int rowMax = 0;
		int index = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			rowSum = 0;
			for (int j = 0; j < matrix[i].length; j++) {				
				rowSum += matrix[i][j];				
			}
			if (rowMax < rowSum) {
				rowMax = rowSum;
				index = i;
			}
		}
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < matrix[index].length; i++) {
			System.out.print(matrix[index][i] + " ");
		}
		
	}
}
