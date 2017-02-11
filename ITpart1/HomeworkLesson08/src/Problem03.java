import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String str1 = null, str2 = null;		
		do {
			System.out.println("Please insert first string without spaces!");
			str1 = sc.nextLine();
			System.out.println("Please insert second string withour spaces!");
			str2 = sc.nextLine();
		} while (str1.contains(" ") || str2.contains(" "));

		if (str1.length() != str2.length()) {
			System.out.println("The length of the both strings are different!");
		} else {
			System.out.println("The length of the both strings is the same!");
		}
		
		if (str1.equals(str2)) {
			System.out.println("The strings are equial!");
		} else {
			String maxStr = str1.length() >= str2.length() ? str1:str2;
			String minStr = str1.length() < str2.length() ? str1:str2;
			
			System.out.println("Difference in position:");
		
			for (int i = 0; i < maxStr.length(); i++) {
				if (i < minStr.length()) {
					if (minStr.charAt(i) != maxStr.charAt(i)) {
						System.out.println((i + 1) + " : " + maxStr.charAt(i) + "-" + minStr.charAt(i));
					}
				} else {
					System.out.println((i + 1) + " : " + maxStr.charAt(i) + "-_");
				}
				
			}
		}
		
	}
}
