/*
 * Do a multiplication table without repeating values with while cycle.
 */
public class Problem23 {

	public static void main(String[] args) {

		int i = 1;
		int j = 1;
		int mul = 0;

		while (i <= 9) {
			while (j <= 9) {
				mul = i * j;
				System.out.print(i + " * " + j + " = " + mul + "; ");
				j++;
			}
			System.out.println();
			j = ++i;
		}

	}
}
