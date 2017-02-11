import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert text!");
		String str = sc.nextLine();
		StringBuilder newStr = new StringBuilder();
		char symbol;
		
		for (int i = 0; i < str.length(); i++) {
			symbol = (char)((int)str.charAt(i) + 5);
			newStr.append(symbol);
		}
		
		System.out.println(newStr);
		
	}
}
