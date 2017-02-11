
public class Problem03 {

	public static void main(String[] args) {
		
		String col = "shapka";
		String row = "mashina";
		
		char[][] matrix = new char[row.length()][col.length()];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ' ';
			}
		}
		
		int indexRow = 0;
		int indexCol = 0;
		boolean match = false;
		
		for (int i = 0; i < row.length(); i++) {
			for (int j = 0; j < col.length(); j++) {
				if (row.charAt(i) == col.charAt(j)) {
					indexRow = i;
					indexCol = j;
					match = true;
					break;
				}
			}
			if (match) {
				break;
			}
		}
		System.out.println(indexRow);
		System.out.println(indexCol);
		
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][indexCol] = row.charAt(i);
		}
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[indexRow][i] = col.charAt(i);
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
	}
}
