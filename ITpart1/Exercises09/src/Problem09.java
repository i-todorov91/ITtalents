
public class Problem09 {

	public static void main(String[] args) {
		
		String str = "lets check how many count of all the chars we have in here!";
		int count = 0;
		int countMax = 0;
		char mostFrequent = 'a';
		
		for(int i = 'a'; i <= 'z'; i++){
			count = 0;
			for (int k = 0; k < str.length(); k++) {
				if (((char) i) == str.charAt(k)) {
					count++;
				}
			}
			System.out.println("We have " + (char) i + " " + count + " times");
			if (countMax < count) {
				countMax = count;
				mostFrequent = (char) i;
			}
		}
		
		System.out.println(mostFrequent + " - " + countMax + " times");
		
		
	}
}
