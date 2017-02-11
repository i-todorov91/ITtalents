import java.util.Scanner;

/*
 * Print all 3-digit numbers without repeating digits
 */
public class Problem12 {

	public static void main(String[] args) {

		for (int i = 102; i <= 987; i++) {
			int first = i / 100;
			int second = i % 100 / 10;
			int third = i % 10;
			if (first != second && first != third && second != third) {
				System.out.println(i);
			}
		}

	}
}
