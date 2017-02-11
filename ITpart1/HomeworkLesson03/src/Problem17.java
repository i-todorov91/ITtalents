import java.util.Scanner;

/*
 * Insert a variable and a symbol and print a square with the symbol within
 * and '*' outside.
 */
public class Problem17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 - Take a variable
		int n;
		do {
			System.out.println("Please insert a number between 3 and 20");
			n = sc.nextInt();
		} while (n < 3 || n > 20);
		// 2 - Take a symbol
		System.out.println("Please insert a symbol:");
		char sym = sc.next().charAt(0);
		// 3 - Print square
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j != 1 && j != n && i != 1 && i != n) {
					System.out.print(sym);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
