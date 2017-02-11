import java.util.Scanner;

/*
 *Check if a number is a polindrome. 
 */
public class Problem24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		// 1 - Take a number in the necessary range
		do {
			System.out.println("Insert a number between 10 and 30000:");
			num = sc.nextInt();
		} while (num < 10 || num > 30000);
		// 2 - Reverse the number
		int rev = 0;
		int dig;
		int temp = num;

		do {
			dig = temp % 10;
			rev = rev * 10 + dig;
			temp /= 10;
		} while (temp != 0);
		// 3 - Check the 2 numbers and print result
		if (rev == num) {
			System.out.println("The number is a polindrome!");
		} else {
			System.out.println("The number is not a polindrome!");
		}

	}
}
