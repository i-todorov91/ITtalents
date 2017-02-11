import java.util.Scanner;

public class ProblemTwo {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("What is the radius of your circle?");
		float rad = sc.nextFloat();
		float area = 3.14f * rad * rad;
		System.out.print("This is the area of your circle: " + area);		
		
	}
}
