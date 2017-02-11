import java.util.Scanner;

/*
 * Insert 2 variable and print all numbers between them that can be divided
 * by 50 in dissenting order using for cycle.
 */
public class Problem16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 - Take 2 variable in the needed range
		int n;
		int m;
		do {
			System.out.println("I need two numbers between 10 and 5555!");
			System.out.println("Please enter the first number:");
			n = sc.nextInt();
			System.out.println("Please enter the second number:");
			m = sc.nextInt();
		} while (n < 10 || m < 10 || n > 5555 || m > 5555);
		// 2 - Find max and min
		int min = n;
		int max = m;

		if (min > max) {
			min = m;
			max = n;
		} else if (min == max) {
			System.out.println("The numbers are equal!");
		}
		// 3 - Print all the needed numbers
		for (int i = max; i >= min; i--) {
			if (i % 50 == 0) {
				System.out.print(i + "; ");
			}
		}

	}
}