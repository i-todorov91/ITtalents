import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = null, str2 = null;
		
		do {
			System.out.println("Please insert first string of 40 or less characters!");
			str1 = sc.next();
			str2 = sc.next();
		} while (str1.length() > 40 || str2.length() > 40);
		
		System.out.print(str1.toUpperCase() + " " + str1.toLowerCase() + " ");
		System.out.print(str2.toUpperCase() + " " + str2.toLowerCase());
		
	}
}
