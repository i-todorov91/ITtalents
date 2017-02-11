import java.util.Scanner;

/*
 * Insert 2 variables and print the numbers between them to the power of 2
 * if they can be divided by 2 and "skip 3" if they can be divided by 3 until 
 * the sum of the numbers gets higher then 200
 */
public class Problem09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 - Take 2 numbers
		System.out.println("Please insert A:");
		int num1 = sc.nextInt();
		System.out.println("Please insert B:");
		int num2 = sc.nextInt();

		// 2 - Find which is bigger
		int max = num1;
		int min = num2;
		if (min > max) {
			max = num2;
			min = num1;
		}

		int sum = 0;
		// 3 - Check the numbers and print result
		// Checking and printing first number
		if (min * min % 3 != 0) {
			System.out.print(min * min);
		} else {
			System.out.print("skip 3");
		}
		// Printing the rest
		for (int i = min + 1; i <= max; i++) {

			int pow = i * i;

			if (pow % 3 == 0) {
				System.out.print(", skip 3");
			} else if (sum > 200) {
				System.out.println();
				System.out.println("The sum got bigger then 200!");
				break;
			} else {
				System.out.print(", " + pow);
				sum += pow;
			}
		}

	}
}
