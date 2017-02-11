
public class Problem03 {

	public static void main(String[] args) {
		
		int[][] matrix = { { 1,2,3,4 },
						   { 5,6,7,8 },
						   { 9,10,11,12 },
						   { 13,14,15,16 }
						 };

		int sumFirst = 0;
		int sumSecond = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				
				if (i == j) {
					sumFirst += matrix[i][j];
				}
				
				if (i + j == matrix.length - 1) {
					sumSecond += matrix[i][j];
				}
				
			}
		}

		System.out.println(sumFirst);
		System.out.println(sumSecond);
		System.out.println();
		System.out.println();
		
		if (sumFirst > sumSecond) {
			System.out.println(sumFirst);
		} else {
			System.out.println(sumSecond);
		}
		
	}
}
