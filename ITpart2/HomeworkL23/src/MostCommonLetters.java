import java.util.Collections;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MostCommonLetters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter some text:");
		String text = sc.nextLine();
		sc.close();
		String temp = text.toLowerCase();
		int numOfLetters = 0;
		
		TreeMap<Character , Integer> charTree = new TreeMap<Character, Integer>();
		
		for (int i = 0; i < temp.length(); i++) {
			char symbol = temp.charAt(i);
			if (symbol >= 'a' && symbol <= 'z') {
				if (!charTree.containsKey(symbol)) {
					charTree.put(symbol, 0);
				}
				int counter = charTree.get(symbol);
				charTree.put(symbol, ++counter);
				numOfLetters++;
			}
		}
		
		System.out.println(charTree);
		
		TreeMap<Integer, String> charTreeDescending = new TreeMap<>(Collections.reverseOrder());
		
		for (Entry<Character, Integer> entry : charTree.entrySet()) {
			if (!charTreeDescending.containsKey(entry.getValue())) {
				charTreeDescending.put(entry.getValue(), "");
			}
			String letters = charTreeDescending.get(entry.getValue());
			charTreeDescending.put(entry.getValue(), letters + entry.getKey());
		}

		System.out.println("Most common leters:");
		for (Entry<Integer, String> entry : charTreeDescending.entrySet()) {
			int percent = 100 / numOfLetters * entry.getKey(); 
			String value = entry.getValue().toUpperCase();
			for (int i = 0; i < value.length(); i++) {
				System.out.print(value.charAt(i) + " : " + entry.getKey() + " ");
				for (int j = 0; j < percent; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
		}
		
	}
}
