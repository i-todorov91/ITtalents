
public class Problem05 {

	public static void main(String[] args) {
		
		int[][] matrix = {
							{  1,  2,  3,  4 },
							{  5,  6,  7,  8 },
							{  9, 10, 11, 12 },
							{ 13, 14, 15, 16 }
					 	 };
		
		int sumCol = 0;
		int maxCol = 0;
		int sumRow = 0;
		int maxRow = 0;
		
		for(int row = 0; row < matrix.length; row++){
			sumCol = 0;
			sumRow = 0;
			for (int col = 0; col < matrix[0].length; col++){
			
				sumRow += matrix[row][col];
				sumCol += matrix[col][row];
			}	
			
			if (sumCol > maxCol) {
				maxCol = sumCol;
			}
			if (sumRow > maxRow) {
				maxRow = sumRow;
			}
		}
		
		System.out.println("The biggest sum of colums is " + maxCol);
		System.out.println("The biggest sum of rows is " + maxRow);
		
		if (maxRow > maxCol) {
			System.out.println("The sum of the rows is bigger then the sum of the colums!");
		} else if (maxRow < maxCol) {
			System.out.println("The sum of the colums is bigger then the sum of the rows!");
		} else {
			System.out.println("Both sums are equil!");
		}
	}
}