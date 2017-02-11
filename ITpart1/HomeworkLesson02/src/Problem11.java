import java.util.Scanner;

/* Make a program that checks if a 3-digit number can be divide
 * by his every digit. 
 */
public class Problem11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take a 3-digit number
		System.out.println("Please insert a 3-digit number without 0's:");
		int origin = sc.nextInt();
		
		if (origin < 100 || origin > 999) {
			System.out.println("The number you entered is not a 3-digit one.");
		} else {
			//2 - Take the number apart in different variables
			int first = origin / 100;
			int second = origin % 100 / 10;
			int last = origin % 10;
			
			if (first == 0 || second == 0 || last ==0) {
				System.out.println("Your number has a 0.");
			} else {
				
				//3 - Check if the number can be divided by his digits. Print result.
				if ( (origin % first == 0) && (origin % second == 0) && (origin % last ==0) ) {
					System.out.println("The number can be divided by his every digit.");
				} else {
					System.out.println("The number can not be dividet by his every digit.");
				}
			}
		}
		
	}
}
