import java.util.Scanner;

/*
 * Да се състави програма, която проверява дали въведено естествено 
 * число е просто.
 */
public class Problem03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number");
		int num = sc.nextInt();
		
		System.out.println("Is the number prime :");
		System.out.println(prime(num));
		
	}
	
	static boolean prime(int num){
		for (int i = num - 1; i > 1; i--) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
