import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert text!");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		int longest = 0;
		
		for (int i = 0; i < words.length; i++) {
			if (longest < words[i].length()) {
				longest = words[i].length();
			}
		}
		
		System.out.println(words.length + " words and the longest has " + longest + " symbols.");
		
	}
}
