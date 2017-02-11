import java.util.Scanner;

/*
 * Да се състави програма, която изчислява произведение на две 
 * естествени числа =>2, като се използва само събиране.
 */
public class Problem02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		do{
			System.out.println("Insert first number:");
			num1 = sc.nextInt();
			System.out.println("Insert second number:");
			num2 = sc.nextInt();
		} while(num1 < 2 && num2 < 2);
		
		System.out.println("The mul of the numbers is: " + mul(num1, num2));
		
	}
	
	static int mul(int a, int b){
		
		if (b == 1) {
			return a;
		}
		
		return a + mul(a, b-1);
	}
	
}
