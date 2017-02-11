import java.util.Scanner;

public class ProblemThree {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first site:");
		float a = sc.nextFloat();
		System.out.println("Enter second site:");
		float b = sc.nextFloat();
		float area = a * b;
		System.out.println(area);
		
	}
}
