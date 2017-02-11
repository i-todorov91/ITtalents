import java.util.Scanner;

/*
 * Insert 2 variables and print the numbers between them in ascending order.
 */
public class Problem05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 - Take 2 variables
		System.out.println("Insert first number:");
		int num1 = sc.nextInt();
		System.out.println("Insert second number:");
		int num2 = sc.nextInt();
		// 2 - Print the in ascending order
		if (num1 < num2) {
			while (num1 <= num2) {
				System.out.print(num1 + " ");
				num1++;
			}
		} else if (num1 > num2) {
			while (num1 >= num2) {
				System.out.print(num2 + " ");
				num2++;
			}
		} else {
			System.out.println("The numbers are equal!");
		}

	}
}
