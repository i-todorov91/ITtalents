
public class Problem06 {

	public static void main(String[] args) {
		
		String str = "az obicham da programiram";
		char c = 'a';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
