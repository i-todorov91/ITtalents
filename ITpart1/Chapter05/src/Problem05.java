import java.util.Scanner;

// Insert p and q and print a table with the required conditions

public class Problem05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the first number:");
		int p = sc.nextInt();
		System.out.println("Insert the second number:");
		int q = sc.nextInt();
		
		for (int i = 1; i <= p; i++){
			
			for (int j = 1; j <= q; j++){
				System.out.print(i);
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
}
