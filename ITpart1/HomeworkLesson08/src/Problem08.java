import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a word!");
		String str = sc.next();
		boolean poly = true;
		
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				poly = false;
				break;
			}
		}
		
		if (poly) {
			System.out.println("The word is a polyndrome!");
		} else {
			System.out.println("The word is not a polyndrome!");
		}
		
	}
}
