import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert text!");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		String firstChar;
		String restChars;
		
		for (int i = 0; i < words.length; i++) {
			firstChar = words[i].substring(0, 1);
			restChars = words[i].substring(1, words[i].length());
			firstChar = firstChar.toUpperCase();
			restChars = restChars.toLowerCase();
			words[i] = firstChar.concat(restChars);
		}
		
		str = String.join(" ", words);
		System.out.println(str);
	}
}
