import java.util.Scanner;

//Insert three variables and print them in descending order.

public class Problem05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take 3 variables.
		System.out.println("Please insert A:");
		int a = sc.nextInt();
		System.out.println("Please insert B:");
		int b = sc.nextInt();
		System.out.println("Please insert C:");
		int c = sc.nextInt();
		
		//2 - Check them and print them in descending order.
		if ( a > b && a > c) {
			if (b > c) {
				System.out.println("The descending order of the numbers is: " + a +
						", " + b + ", " + c + "!");
			} else {
				System.out.println("The descending order of the numbers is: " + a +
						", " + c + ", " + b + "!");
			}
		} else if ( b > a && b > c) {
			if (a > c) {
				System.out.println("The descending order of the numbers is: " + b +
						", " + a + ", " + c + "!");
			} else {
				System.out.println("The descending order of the numbers is: " + b +
						", " + c + ", " + a + "!");
			}
		} else {
			if (a > b){
				System.out.println("The descending order of the numbers is: " + c +
						", " + a + ", " + b + "!");				
			} else {
				System.out.println("The descending order of the numbers is: " + c +
						", " + b + ", " + a + "!");	
			}
		}
		
	}
}
