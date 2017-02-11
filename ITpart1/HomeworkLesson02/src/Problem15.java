import java.util.Scanner;

/* Make a program that takes an input of a hour
 * and prints the proper greeting.
 */

public class Problem15 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take the input hour
		System.out.println("Please enter a valid hour:");
		byte hour = sc.nextByte();
		
		if (hour < 0 || hour > 24){
			System.out.println("Invalid hour.");			
		} else {
		
		//2 - Check the hour and print the correct response.
			if (hour > 4 && hour <= 9) {
				System.out.println("Good Morning!");
			} else if (hour > 9 && hour <= 18) {
				System.out.println("Good Afternoon!");
			} else {
				System.out.println("Good Evening!");
			}
		}
		
	}
}
