import java.util.Scanner;

/*
 * Insert a variable and print all 3-digit numbers which digits are
 * equal to the variable.
 */
public class Problem13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 - Take a variable
		int sum;
		do {
			System.out.println("Please insert a sum between 2 and 27:");
			sum = sc.nextInt();
		} while (sum < 2 || sum > 27);
		// 2 - Check all 3-digit numbers and print the needed
		for (int i = 100; i <= 999; i++) {
			int first = i / 100;
			int second = i % 100 / 10;
			int third = i % 10;
			if (first + second + third == sum) {
				System.out.print(i + "; ");
			}
		}

	}
}
