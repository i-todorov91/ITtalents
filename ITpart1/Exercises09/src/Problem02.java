
public class Problem02 {

	public static void main(String[] args) {
		
		String str = "sUper qKaTa RaBoTa";
		str = str.toLowerCase();
		
		String[] arr = str.split(" ");
		
		String firstChar;
		String restChars;
		
		for (int i = 0; i < arr.length; i++) {
			firstChar = arr[i].substring(0, 1);
			restChars = arr[i].substring(1, arr[i].length());
			firstChar = firstChar.toUpperCase();
			arr[i] = firstChar.concat(restChars);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
