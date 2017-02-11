
public class Problem02 {

	public static void main(String[] args) {
		
		String str1 = "hipopotam";
		String str2 = "hipopotuk";
		
		String strMax = str1;
		String strMin = str2;
		if (str1.length() < str2.length()) {
			strMax = str2;
			strMin = str1;
		}
		
		for (int i = 0; i < strMax.length(); i++) {
			if (strMin.charAt(i) != strMax.charAt(i)) {
				System.out.println(i + " " + strMin.charAt(i) + "-" + strMax.charAt(i));
			}
		}
		
	}
}
