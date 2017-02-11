import java.util.Scanner;

/* Insert 3 values a1, a2, a3 and swap the position so a1 becomes a2,
 * a2 becomes a3 and a3 becomes a1's original number.
 */
public class Problem06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take 3 variables.
		System.out.println("Please insert a1:");
		int a1 = sc.nextInt();
		System.out.println("Please insert a2:");
		int a2 = sc.nextInt();
		System.out.println("please insert a3:");
		int a3 = sc.nextInt();
		
		//2 - Swap the position of the variables.
		int valueHolder = a1;
		a1 = a2;
		a2 = a3;
		a3 = valueHolder;
		
		//3 - Print the new values of the variables.
		System.out.println("The new value of a1 is " + a1 + " of a2 is " + a2 
				+ " and of a3 is " + a3 + "!");
		
	}
}
