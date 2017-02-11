
public class Problem01 {

	public static void main(String[] args) {
		
		int[][] matrix = {  { 5,3,2,6,4 },
							{ 5,3,1,6,3 },
							{ 3,9,6,2,6 }
						 };
		
		int num;
		int countNum = 1;
		int numMax = matrix[0][0];
		int countMax = 1;
		int numMax2 = matrix[0][0];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				num = matrix[i][j];
				countNum = 0;
				for (int k = 0; k < matrix.length; k++) {
					for (int o = 0; o < matrix[k].length; o++) {
						
						if (num == matrix[k][o]) {
							countNum++;
						}
						
					}
				}
				if (countNum > countMax) {
					countMax = countNum;
					numMax = num;
				}
							}
		}

		System.out.println("The number is " + numMax + " and we have it " + countMax + " times.");
	}
}
