
public class Problem05 {

	public static void main(String[] args) {
		
		int[][] matrix = { { 1,2,3,4 },
						   { 101,6,7,8 },
						   { 45,102,11,12 },
						   { 30,555,99,16 }
						 };
		long mul = 1;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j < i) {
					mul *= matrix[i][j];
				}
			}
		}
		
		System.out.println(mul);
		
	}
}
