import java.util.Scanner;

/*
 * Insert a variable and make the needed number row
 */
public class Problem19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 - Take a variable
		int n;
		do {
			System.out.println("Please insert a number between 10 and 99:");
			n = sc.nextInt();
		} while (n < 10 || n > 99);
		// 2 - Print the number row
		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
				System.out.print(n + " ");
			} else {
				n = n * 3 + 1;
				System.out.print(n + " ");
			}
		}

	}
}
