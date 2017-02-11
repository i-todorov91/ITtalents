import java.util.Scanner;

/*
 * Insert a variable and print the needed tables
 */
public class Problem08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 - Take a variable
		System.out.println("Please insert a number:");
		int num = sc.nextInt();

		// 2 - Print the tables
		int dig = num - 1;
		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= num; j++) {
				System.out.print(dig);
			}
			System.out.println();
			dig += 2;

		}

	}
}
