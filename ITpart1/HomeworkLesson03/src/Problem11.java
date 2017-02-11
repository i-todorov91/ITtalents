import java.util.Scanner;

/*
 * Insert a number and print a triangle with the numbers height.
 */
public class Problem11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1 - Take a variable
		System.out.println("Please insert the height of the triangle:");
		int h = sc.nextInt();
		int stars = 1;
		int spaces = h - 1;

		if (h <= 0) {
			System.out.println("The height must be a positive number!");
		} else {
			// 2 - Print row by row
			for (int row = 1; row <= h; row++) {

				for (int sp = 1; sp <= spaces; sp++) {
					System.out.print(" ");
				}
				for (int st = 1; st <= stars; st++) {
					System.out.print("*");
				}
				stars += 2;
				spaces--;
				System.out.println();
			}
		}

	}
}
