
public class Problem05 {

	public static void main(String[] args) {
		
		String str = "HHello";
		StringBuilder newStr = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			newStr = newStr.append((char)(str.charAt(i) + 5));
		}
		
		for (int i = 0; i < str.length(); i++){
			str = str.replace(str.charAt(i), (char)(str.charAt(i) + 5));
		}
		System.out.println(str);
		System.out.println(newStr);
	}
}
