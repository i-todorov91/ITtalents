
public class Problem01 {

	public static void main(String[] args) {
		
		int[][] matrix = {
							{ 48, 72, 13, 14, 15 },
							{ 21, 22, 53, 24, 75 },
							{ 31, 57, 33, 34, 35 },
							{ 41, 95, 43, 44, 45 },
							{ 59, 52, 53, 54, 55 },
							{ 61, 69, 63, 64, 65 }
					 	 };
		
		int maxValue = matrix[0][0];
		int minValue = matrix[0][0];
		
		for(int row = 0; row < matrix.length; row++){
			
			for (int col = 0; col < matrix[0].length; col++){
				
				if (matrix[row][col] < minValue) {
					minValue = matrix[row][col];
					continue;
				} else if (matrix[row][col] > maxValue) {
					maxValue = matrix[row][col];
				}	
			}			
		}
		
		System.out.println("The biggest numbers is " + maxValue);
		System.out.println("The smallest numbers is " + minValue);
		
	}
}
