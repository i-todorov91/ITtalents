import java.util.Scanner;

/*
 * Insert a variable and print 10 numbers bigger then the variable 
 * that can be divided by 2, 3 and 5.
 */
public class Problem22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 - Take a variable in the needed range
		int num;
		do {
			System.out.println("Please insert a number between 1 and 999:");
			num = sc.nextInt();
		} while (num < 1 || num > 999);

		// 2 - Check numbers bigger then num and print the needed
		int i = 1;
		while (i <= 10) {
			if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
				System.out.print(i + ":" + num + "; ");
				i++;
				num++;
			} else {
				num++;
			}
		}

	}
}
