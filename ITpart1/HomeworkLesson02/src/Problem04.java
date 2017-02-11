import java.util.Scanner;

//Insert two numbers A and B and print them in ascending order.

public class Problem04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take 2 variables.
		System.out.println("Please insert A:");
		int a = sc.nextInt();
		System.out.println("Please insert B:");
		int b = sc.nextInt();
		
		//2 - Check which is bigger and print them in ascending order
		if (a < b) {
			System.out.println("The ascending order of " + a + " and " +
		b + " is: " + a + ", " + b + "!");
		} else {
			System.out.println("The ascending order of " + a + " and " +
		b + " is: " + b + ", " + a + "!");
		}
		
	}
}
