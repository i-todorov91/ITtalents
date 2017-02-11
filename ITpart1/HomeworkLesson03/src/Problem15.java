import java.util.Scanner;

/*
 * Insert a variable num and print the sum of all the numbers from num to 1.
 * Using do-while.
 */
public class Problem15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 - Take a variable
		System.out.println("Please insert a number:");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		// 2 - Check variable
		if (n >= 0) {
			do {
				sum += i;
				i++;
			} while (i <= n);
		} else {
			do {
				sum += i;
				i--;
			} while (i >= n);
		}
		// 3 - Print the sum
		System.out.println("The sum of the numbers between 1 and " + n + " is: " + sum);

	}
}
