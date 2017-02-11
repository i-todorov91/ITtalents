import java.util.Scanner;

public class Problem09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a string!");
		String str = sc.next();
		int temp = 0;
		int mark = 1;
		int sum = 0;	
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				if (i != 0) {
					if (str.charAt(i - 1) == '-') {
						mark = -1;
					}
				}
				temp = temp*10 + (int)str.charAt(i) - 48;
				if (i == str.length() - 1) {
					temp = temp * mark;
					sum += temp;
					if (temp != 0) {
						System.out.println(temp);
					}
				}
			} else {
				temp = temp * mark;
				sum += temp;
				if (temp != 0) {
					System.out.println(temp);
				temp = 0;
				mark = 1;
				}	
			}			
		}
		System.out.println("The sum is " + sum);
		
	}	
}
