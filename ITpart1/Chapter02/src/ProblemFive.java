import java.util.Scanner;

public class ProblemFive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your number:");
		int a = sc.nextInt();
		System.out.println( (a % 7) == 0);
		
	}
}
