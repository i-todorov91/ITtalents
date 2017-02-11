import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = null, str2 = null;
		
		do {
			System.out.println("Please insert first string of 10-20 characters!");
			str1 = sc.next();
			System.out.println("Please insert second string of 10-20 characters!");
			str2 = sc.next();
		} while (str1.length() > 20 || str2.length() > 20 
				|| str1.length() < 10 || str2.length() < 10);
		
		String subStr = str1.substring(0, 5);
		
		str1 = str1.replace(subStr, str2.substring(0, 5));
		str2 = str2.replace(str2.substring(0, 5), subStr);
		
		System.out.println("The new Strings are " + str1 + " " + str2);
		System.out.println("And the bigger is:");
		
		if (str1.length() > str2.length()) {
			System.out.println(str1 + " with a length of " + str1.length());
		} else {
			System.out.println(str2 + " with a length of " + str2.length());
		}
		
		
	}
}
