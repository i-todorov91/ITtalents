import java.util.Scanner;

public class ProblemFour {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert your sites:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
					
		System.out.println( ((a + b) > c) && ((a + c) > b) && ((b + c) > a) );
		
	}
}
