import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		number = number >> 4;
		
		if ((number & 1) == 1) {
			System.out.println("The bit is on.");
		} else {
			System.out.println("The bit is off.");
		}
	}
}
