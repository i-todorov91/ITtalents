
public class Problem06 {

	public static void main(String[] args) {
		
		int[][] matrix = { { 4,9,2 },
						   { 3,5,7 },
						   { 8,1,6 }
						   
						 };
		
		boolean magic = true;
		int sum = 0;
		
		for (int i = 0; i < matrix[0].length; i++) {
			sum += matrix[0][i];
		}
		
		int sumD1 = 0;
		int sumD2 = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					sumD1 += matrix[i][j];
				}
				if (i + j == matrix.length - 1) {
					sumD2 += matrix[i][j];
				}
			}			
		}
		if (sum != sumD1 || sum != sumD2) {
			magic = false;
		}
		
		int sumTemp = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			sumTemp = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sumTemp += matrix[i][j];
			}
			if (sum != sumTemp) {
				magic = false;
				break;
			}
		}
			
		System.out.println(magic);
		
	}
}
