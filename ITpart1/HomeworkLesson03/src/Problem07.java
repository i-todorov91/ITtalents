import java.util.Scanner;

/*
 * Start from 3 and print the first 'n' numbers divided by 3.
 */
public class Problem07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1 - Take a positive number
		int num;
		do {
			System.out.println("Insert a positiv number:");
			num = sc.nextInt();
		} while (num <= 0);

		// 2 - Start from 3
		int res = 3;
		System.out.print(res);
		// 3 - Print n numbers
		for (int i = 1; i < num; i++) {
			res += 3;
			System.out.print(", " + res);
		}

	}
}
