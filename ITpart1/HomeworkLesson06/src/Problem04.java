
public class Problem04 {

	public static void main(String[] args) {
		
		int[][] matrix = {
							{  1,  2,  3,  4 },
							{  5,  6,  7,  8 },
							{  9, 10, 11, 12 },
							{ 13, 14, 15, 16 }
					 	 };
		
		System.out.println("The new matrix is: ");
		
		for(int row = 0; row < matrix.length; row++){
			
			for (int col = matrix[0].length - 1; col >= 0; col--){
				if (matrix[col][row] < 10) {
					System.out.print(matrix[col][row] + "  ");
				} else {
					System.out.print(matrix[col][row] + " ");
				}
			}	
			System.out.println();
		}
		
	}
}