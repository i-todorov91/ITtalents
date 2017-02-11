import java.util.Scanner;

/* Make a program that calculate how to fill a tank with water
 * using 2 buckets one of 2 liters and the other of 3 liters. 
 */
public class Problem10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take the tank capacity in a variable
		System.out.println("Please enter the tank capacity (has to be in 10 - 9999 range):");
		int tankCapacity = sc.nextInt();
		byte pairWeight = 5;
		
		if (tankCapacity < 10 || tankCapacity > 9999) {
			System.out.println("Invalid tank capacity.");
		} else {
		//2 - Calculate how much rounds of bucket pair you need
			int pairs = tankCapacity / pairWeight;
			
		//3 - Calculate how much is left and how to fill it
			int mod = tankCapacity % pairWeight;
			switch (mod) {
			case 4:
				System.out.println("You need " + pairs + " times 3l and " 
						+ pairs + " times 2l and another 2 buckets of 2l.");
				break;
			case 3:
				System.out.println("You need " + pairs + " times 3l and " 
						+ pairs + " times 2l and another bucket of 3l.");
				break;
			case 2:
				System.out.println("You need " + pairs + " times 3l and " 
						+ pairs + " times 2l and another bucket of 2l.");
				break;
			case 1:
				System.out.println("You need " + (pairs - 1) + " times 3l and " 
						+ (pairs - 1) + " times 2l and another 2 buckets of 3l.");
				break;
			default:
				System.out.println("You need " + pairs + " times 3l and " 
						+ pairs + " times 2l.");
				break;
			}			
		}
		
	}
}
