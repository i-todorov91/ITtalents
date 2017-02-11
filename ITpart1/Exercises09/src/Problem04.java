
public class Problem04 {

	public static void main(String[] args) {
		
		String str = "aabjhbaa";
		
		boolean palindrome = true;
		
		for (int a = 0, b = str.length() - 1; a < b; a++, b--) {
			if (str.charAt(a) != str.charAt(b)) {
				palindrome = false;
				break;
			}
		}
		
		System.out.println(palindrome);
	}
}
