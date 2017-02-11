
public class Problem08 {

	public static void main(String[] args) {
		
		String str1 = "abcdefg";
		String str2 = "efkdabc";
		boolean hasAllChars = true;
		int hasChar = 0;
		
		for (int i = 0; i < str1.length(); i++) {
			hasChar = str2.indexOf(str1.charAt(i));			
			if (hasChar == -1) {
				System.out.println("Dont have: " + str1.charAt(i));
				hasAllChars = false;
			}
		}
		
		if (hasAllChars) {
			System.out.println("We have all the chars!");
		}
		
	}
}
