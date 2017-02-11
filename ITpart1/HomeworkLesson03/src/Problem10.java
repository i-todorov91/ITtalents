import java.util.Scanner;

/*
 * Insert a number and check if it is prime. Print result.
 */
public class Problem10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 - Take a variable
		System.out.println("Please inser a number:");
		int num = sc.nextInt();

		// 2 - Check if it is prime
		boolean flag = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		// 3 - Print result
		if (flag) {
			System.out.println("The number you've entered is prime!");
		} else {
			System.out.println("The number you've entered is not prime!");
		}

	}
}
