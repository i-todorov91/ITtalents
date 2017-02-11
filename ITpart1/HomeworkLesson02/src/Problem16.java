import java.util.Scanner;

/* Enter a 3-digit number and check if the digits
 * in it are equal, in ascending or descending order.
 */

public class Problem16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take a 3-digit number.
		System.out.println("Please enter a 3-digit number:");
		int origin = sc.nextInt();
		
		if (origin < 100 || origin > 999) {
			System.out.println("The number you entered is not a 3-digit one.");
		} else {
		//2 - Take the number apart in different variables
			int first = origin / 100;
			int second = origin % 100 / 10;
			int last = origin % 10;
		
		//3 - Check the digits and print the result
			if (first == second && first == last && second == last) {
				System.out.println("The digits are equal.");
			} else if (first > second && second > last) {
				System.out.println("The digits are in descending order.");
			} else if (first < second && second < last) {
				System.out.println("The digits are in ascending order.");
			} else {
				System.out.println("The digits are in no particular order.");
			}
			
		}
		
	}
}
