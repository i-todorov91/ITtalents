import java.util.Scanner;

//Insert two numbers A and B and swap their values

public class Problem03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take 2 variables.
		System.out.println("Please insert A:");
		double a = sc.nextDouble();
		System.out.println("Please insert B:");
		double b = sc.nextDouble();
		
		//2 - Swap their values.
		double valueHolder = a;
		a = b;
		b = valueHolder;
		
		//3 - Print the result.
		System.out.println("The value of A is " + a + " and the value of B is " + b + "!");
		
	}
}
