
public class Problem04 {

	public static void main(String[] args) {
		
		boolean[][] matrix = { { false,false,false,true },
							   { false,true,false,true },
							   { false,false,false,false },
							   { false,false,false,false }
						 	 };
		
		boolean hasTrue = false;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i + j < matrix.length - 1) {
					if (matrix[i][j] == true) {
						hasTrue = true;
						break;
					}
				}
			}
			if (hasTrue) {
				break;
			}
		}
		
		System.out.println(hasTrue);
		
		
	}
}
