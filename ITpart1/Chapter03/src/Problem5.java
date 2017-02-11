import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = number1 ^ number2;
		int count = 0;
		
		while ( (number1 != 0) || (number2 !=0) ) {
			
			if (( (number1 & 1) == 1 ) && ( (number2 & 1) == 1 )) {
				count++;
			} else if (( (number1 & 1) == 0 ) && ( (number2 & 1) == 0)) {
				count++;				
			}
			
			number1 = number1 >> 1;
			number2 = number2 >> 1;
			
		}
		
		System.out.println(count);
		
	}
}
