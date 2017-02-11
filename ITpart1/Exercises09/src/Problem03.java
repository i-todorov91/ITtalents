
public class Problem03 {

	public static void main(String[] args) {
		
		String str = "tazi zadacha ne e nikak losha";
		String[] words = str.split(" ");
		System.out.println(words.length + " words");
		
		int length = 0;
		int lengthMax = 0;
		
		for (int i = 0; i < words.length; i++) {
			length = words[i].length();
			if (lengthMax < length) {
				lengthMax = length;
			}
		}
		
		System.out.printf("Biggest word with %d characters", lengthMax);
		
	}
}
