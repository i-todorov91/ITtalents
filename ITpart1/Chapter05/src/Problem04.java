import java.util.Scanner;

//Insert a number and check if it is a prime.

public class Problem04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number:");
		int num = sc.nextInt();
		boolean isPrime = true;
		
		for (int i = 2; i < num; i++){
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println("The number is prime!");
		} else {
			System.out.println("The number is not a prime one!");
		}
		
	}
}
