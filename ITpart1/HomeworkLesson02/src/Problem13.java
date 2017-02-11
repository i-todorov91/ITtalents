import java.util.Scanner;

/* Make a program thats guesses the temperature feel based on the
 * input of the outside temperature in Celsius.
 */

public class Problem13 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take a input of degrees Celsius.
		System.out.println("Please enter the outside temperature:");
		byte degrees = sc.nextByte();
		
		if (degrees < -100 || degrees > 100) {
			System.out.println("Invalid temperature.");
		} else {
		//2 - Run cases and print result.
			if (degrees <= -20) {
				System.out.println("Its freezing outside.");
			} else if (degrees <= 0) {
				System.out.println("Its cold outside.");
			} else if (degrees <= 15) {
				System.out.println("Its chilly outside.");
			} else if (degrees <= 25) {
				System.out.println("Its warm outside.");
			} else {
				System.out.println("Ist hot outside.");
			}			
		}
		
	}
}
