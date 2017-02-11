
public class Problem06 {

	public static void main(String[] args) {
		
		int[][] matrix = {
							{ 48, 72, 13, 14, 15, 16 },
							{ 21, 22, 53, 24, 75, 26 },
							{ 31, 57, 33, 34, 35, 36 },
							{ 41, 95, 43, 44, 45, 46 },
							{ 59, 52, 53, 54, 55, 56 },
							{ 61, 69, 63, 64, 65, 66 }
					 	 };
		
		int sum = 0;
		int total = 0;
		
		for(int row = 0; row < matrix.length; row++){
			sum = 0;
			if (row % 2 == 0) {
				
				for (int col = 0; col < matrix[0].length; col++){
					if (col == matrix[0].length - 1) {
						System.out.print(matrix[row][col]);
					} else {
						System.out.print(matrix[row][col] + ", ");
					}
					sum += matrix[row][col];
				}
			System.out.println(" the sum is " + sum);
			}
			total +=sum;
		}
		System.out.println("The total sum is " + total);
	}
}