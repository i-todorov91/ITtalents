import java.util.Scanner;

/*
 * Insert a variable num and print the sum of all the numbers from num to 1. 
 */
public class Problem06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 - Take a variable
		System.out.println("Insert a number:");
		int num = sc.nextInt();
		int sum = 0;
		// 2 - Check variable and print the sum
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("The sum of the numbers between 1 and " + num + " is: " + sum);
		} else if (num < 0) {
			for (int i = 1; i >= num; i--) {
				sum += i;
			}
			System.out.println("The sum of the numbers between 1 and " + num + " is: " + sum);
		} else {
			System.out.println("The sum of the numbers between 1 and " + num + " is: 1");
		}

	}
}
