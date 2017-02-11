
public class Problem03 {

	public static void main(String[] args) {
		
		int[][] matrix = {
							{ 48, 72, 13, 14, 15 },
							{ 21, 22, 53, 24, 75 },
							{ 31, 57, 33, 34, 35 },
							{ 41, 97, 43, 44, 45 },
							{ 59, 52, 53, 54, 55 },
							{ 61, 69, 63, 64, 65 }
					 	 };
		
		double sum = 0;
		double avr;
		double el = 0;
		
		for(int row = 0; row < matrix.length; row++){
			
			for (int col = 0; col < matrix[0].length; col++){
				
				sum += matrix[row][col];
				el++;
			}			
		}
		
		avr = sum / el;
		
		System.out.println("The sum of the numbers is " + sum);
		System.out.println("The avrage of the numbers is " + avr);
		
	}
}