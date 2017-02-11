/*
 * Make a table in which every row and colon sum is 45
 */
public class Problem20 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = i; j <= 9; j++) {
				System.out.print(j + " ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}
}
