import java.util.Scanner;

/*
 * Insert 2 variables and print the multiplication table with them
 */
public class Problem18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 - Take 2 variables
		int n;
		int m;
		do {
			System.out.println("I need two numbers between 1 and 9!");
			System.out.println("Please enter the first number:");
			n = sc.nextInt();
			System.out.println("Please enter the second number:");
			m = sc.nextInt();
		} while (n < 1 || m < 1 || n > 9 || m > 9);
		// 2 - Print table
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				int mul = i * j;
				System.out.println(i + "*" + j + "= " + mul);
			}
		}

	}
}
