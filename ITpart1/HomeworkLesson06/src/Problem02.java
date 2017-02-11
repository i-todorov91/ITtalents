import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert the numbers of the rows and coloms:");
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		int[] d1 = new int[n];
		int[] d2 = new int[n];
		int i1 = 0;
		int i2 = 0;
		
		for(int row = 0; row < matrix.length; row++){
			
			for(int col = 0; col < matrix[0].length; col++){
				System.out.print("Plese insert the elemenet matrix[" + row 
						+ "][" + col + "]: ");
				matrix[row][col] = sc.nextInt();
				
				if (row == col) {
					d1[i1] = matrix[row][col];
					i1++;
					continue;
				} else if (row + col == n - 1) {
					d2[i2] = matrix[row][col];
					i2++;
				}
			}
		}
		System.out.println("The first diagonal is: ");
		for(int i = 0; i < d1.length; i++){
			System.out.print(d1[i] + " ");
		}
		System.out.println();
		System.out.println("The second diagonal is: ");
		for(int i = 0; i < d2.length; i++){
			System.out.print(d2[i] + " ");
		}
		
	}
}
