import java.util.Scanner;

/* Make a program that takes two numbers A and B.
 * And calculates every arithmetic equation.
 */
public class Problem02double {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take 2 variables A and B.
		System.out.println("Please insert A:");
		double a = sc.nextDouble();
		System.out.println("Please insert B:");
		double b = sc.nextDouble();
		
		//2 - Calculate the sum and put it in a new variable.
		double sum = a + b;
		System.out.println("A + B = " + sum);
		
		//3 - Calculate the subtraction and put it in a new variable.
		double sub1 = a - b;
		double sub2 = b - a;
		System.out.println("A - B = " + sub1);
		System.out.println("B - A = " + sub2);
		
		//4 - Calculate the multiplication result and put it in a new variable.
		double mul = a * b;
		System.out.println("A * B = " + mul);
		
		//5 - Calculate the remainder of devision and put it in a new variable.
		double mod1;
		double mod2;
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
		double div1;
		double div2;
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
