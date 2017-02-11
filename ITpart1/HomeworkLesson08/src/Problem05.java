import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = null;
		String str2 = null;		
		
		do {
			System.out.println("Please insert first string without spaces!");
			str1 = sc.nextLine();
			System.out.println("Please insert second string withour spaces!");
			str2 = sc.nextLine();
		} while (str1.contains(" ") || str2.contains(" "));
		
		boolean haveSameChar = false;
		
		for (int i = 0; i < str1.length(); i++) {			
			if (str1.charAt(i) == str2.charAt(0)) {
				haveSameChar = true;
			}
		}
		
		if (haveSameChar) {
			for (int i = 0; i < str1.length(); i++) {			
				if (str1.charAt(i) == str2.charAt(0)) {
					System.out.println(str2);
				} else {
					System.out.println(str1.charAt(i));
				}
			}
		} else {
			System.out.println("The word dont have a matching char for the start of second str.");
		}
		
	}
}
