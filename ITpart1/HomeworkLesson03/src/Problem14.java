import java.util.Scanner;

/*
 * Insert a variable and print all smaller numbers that can be divided by 7
 */
public class Problem14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 - Take the needed variable
		int n;
		do {
			System.out.println("Please insert a number between 10 and 200");
			n = sc.nextInt();
		} while (n < 10 || n > 200);

		// 2 - Check if it can be divided by 7 and print if it can
		for (int i = n; i >= 7; i--) {
			if (i % 7 == 0) {
				System.out.print(i + "; ");
			}
		}

	}
}
