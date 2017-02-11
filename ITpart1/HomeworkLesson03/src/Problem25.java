import java.util.Scanner;

/*
 * Insert a variable and print it's factorial
 */
public class Problem25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 - Take a variable
		int num;
		do {
			System.out.println("Please insert a positive number:");
			num = sc.nextInt();
		} while (num < 1);

		int i = 1;
		int mul = 1;
		// 2 - Calculate the factorial and print it
		do {
			mul *= i;
			i++;
		} while (i <= num);

		System.out.println("The factorial of the number " + num + " is " + mul);

	}
}
