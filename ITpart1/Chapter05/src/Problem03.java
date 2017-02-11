import java.util.Scanner;

// Insert a number and print the sum of all numbers to it
public class Problem03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number:");
		int num = sc.nextInt();
		int sum = 0;
		
		if (num < 0) {
			for(int i = 1; i >= num; i--){
				sum+=i;
			}
		} else {
			for(int i = 1; i <= num; i++){
				sum+=i;
			}
		}
		
		System.out.println("The sum of numbers from 1 to " + num + " is: " + sum);
	}
}
