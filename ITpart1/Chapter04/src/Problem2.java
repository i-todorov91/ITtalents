import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		if (number1 > number2 && number2 > number3) {
			System.out.println("Number2 is in the midle.");
		} else if (number1 < number2 && number2 < number3) {
			System.out.println("Number2 is in the midle.");
		} else {
			System.out.println("Number2 is not in the midle.");
		}
	}
}
