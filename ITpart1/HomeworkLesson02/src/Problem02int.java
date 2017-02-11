import java.util.Scanner;

/* Make a program that takes two numbers A and B.
 * And calculates every arithmetic equation.
 */
public class Problem02int {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take 2 variables A and B.
		System.out.println("Please insert A:");
		int a = sc.nextInt();
		System.out.println("Please insert B:");
		int b = sc.nextInt();
		
		//2 - Calculate the sum and put it in a new variable.
		int sum = a + b;
		System.out.println("A + B = " + sum);
		
		//3 - Calculate the subtraction and put it in a new variable.
		int sub1 = a - b;
		int sub2 = b - a;
		System.out.println("A - B = " + sub1);
		System.out.println("B - A = " + sub2);
		
		//4 - Calculate the multiplication result and put it in a new variable.
		int mul = a * b;
		System.out.println("A * B = " + mul);
		
		//5 - Calculate the remainder of devision and put it in a new variable.
		int mod1;
		int mod2;
		if (a == 0 && b == 0) {
			System.out.println("You can not mod by 0.");
		} else if (a == 0 && b !=0) {
			mod1 = a / b;
			System.out.println("A / B = " + mod1);
		} else if (a != 0 && b == 0) {
			mod2 = b / a;
			System.out.println("B / A = " + mod2);
		} else {
			mod1 = a / b;
			System.out.println("A / B = " + mod1);
			mod2 = b / a;
			System.out.println("B / A = " + mod2);
		}
		
		//6 - Calculate the full value division and put it in a new variable.
		int div1;
		int div2;
		if (a == 0 && b == 0) {
			System.out.println("You can not divide by 0.");
		} else if (a == 0 && b !=0) {
			div1 = a / b;
			System.out.println("A / B = " + div1);
		} else if (a != 0 && b == 0) {
			div2 = b / a;
			System.out.println("B / A = " + div2);
		} else {
			div1 = a / b;
			System.out.println("A / B = " + div1);
			div2 = b / a;
			System.out.println("B / A = " + div2);
		}
				
	}
}
