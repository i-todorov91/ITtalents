import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int setBits = 0;
		int numberOfBits = 0;
		
		while (number !=0) {
			
			if ((number & 1) == 1) {
				setBits++;
			}
			numberOfBits++;
			number = number >> 1;
			
		}
		
		System.out.println(setBits);
		System.out.println(numberOfBits);
		
	}
}
