
public class Problem01 {

	public static void main(String[] args) {
		
		String firstWord = "uchilishe";
		String secondWord = "uchenik";
		
		String temp = firstWord.substring(0, 5);
		firstWord = firstWord.replace(temp, secondWord.substring(0, 5));
		secondWord = secondWord.replace(secondWord.substring(0, 5), temp);
		
		if (firstWord.length() < secondWord.length()) {
			System.out.println(secondWord.length() + " " + secondWord);
		} else {
			System.out.println(firstWord.length() + " " + firstWord);
		}
		
	}
}
