import java.util.Scanner;

/* The program reads from the console a 4-digit number.
 * It makes two new 2-digit numbers. The first number is a combination of
 * the first and last digit from the original number. The second number
 * is the combination of the remaining digits. The program prints a 
 * comparison of the two. 
 */
public class Problem08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take a 4-digit variable
		System.out.println("Pleasy enter a 4-digit number:");
		int origin = sc.nextInt();
		
		if (origin < 1000 || origin > 9999){
			System.out.println("The number is not a 4-digit one!");
		} else {
			
			System.out.println("Thank you!");
			
			//2 - Make 2 new variables with the needed conditions
			int first = origin / 1000;
			int second = origin % 1000 / 100;
			int third = origin % 100 / 10;
			int fourth = origin % 10;
			
			int number1 = first * 10 + fourth;
			int number2 = second * 10 + third;
			
			//3 - Compare the new variables and print the result	
			if (number1 < number2) {
				System.out.println("The first number is smaller.");
			} else if (number1 == number2) {
				System.out.println("The two numbers are equal.");
			} else {
				System.out.println("The first number is bigger.");
			}			
		}
		
	}
}
