import java.util.Scanner;

/*  Make a program that takes two numbers A and B.
	After taking a third number C, checks if it is between A and B.
*/

public class Problem01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take 3 variables A, B, C.
		System.out.println("Please insert A:");
		double a = sc.nextDouble();
		System.out.println("Please insert B:");
		double b = sc.nextDouble();
		System.out.println("Please insert C:");
		double c = sc.nextDouble();
		
		//2 - Check if C is between A and B.
		if ((a > c && c > b) || (a < c && c < b) ) {
		
		//3 - If yes print that it is.	
			System.out.println("The number " + c + " is between " + a + " and " + b + "!");
		} else {
		
		//4 - If no print that it is not.	
			System.out.println("The number " + c + " is not between " + a + " and " + b + "!");
		}		

	}
}
