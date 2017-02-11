import java.util.Scanner;

/* The program reads two 2-digit numbers and prints
 * the multiplication result of the two and if the 
 * last digit is an odd number or not. 
 */
public class Problem09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take two 2-digit variables
		System.out.println("Hello I need two 2-digit numbers!");
		System.out.println("Please enter a:");
		byte number1 = sc.nextByte();
		System.out.println("Please enter b:");
		byte number2 = sc.nextByte();
		
		if ( (number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99) ) {
			System.out.println("The numbers are not in the 10 - 99 range.");
		} else {
			//2 - Multiply them and save in a new variable
			int mul = number1 * number2;
			
			//2' - Put the last digit of mul in a new variable
			int lastDigit = mul % 10;
			
			//3 - Check if the last number is odd and prints the result
			if (lastDigit % 2 == 0) {
				System.out.println("The multiplication of " + number1 + " and " + number2
						+ " is " + mul + " and " + lastDigit + " is even.");
			} else {
				System.out.println("The multiplication of " + number1 + " and " + number2
						+ " is " + mul + " and " + lastDigit + " is odd.");
			}
			
		}
		
	}
}
