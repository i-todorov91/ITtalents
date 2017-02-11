
public class Problem10 {

	public static void main(String[] args) {
		
		String[] arr = { "Hello", "World", "in", "a", "frame" };
		
		int maxLength = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(maxLength < arr[i].length()){
				maxLength = arr[i].length();
			}
		}
		
		char[][] framed = new char[arr.length + 2][maxLength + 2];
		
		for (int i = 0; i < framed.length; i++) {
			for (int j = 0; j < framed[i].length; j++) {
				if (i == 0 || i == framed.length - 1) {
					System.out.print('*');
				} else {
					if (j == 0 || j == framed[i].length - 1) {
						System.out.print('*');
					} else if (arr[i - 1].length() >= j) {
						System.out.print(arr[i - 1].charAt(j - 1));
					} else {
						System.out.print(' ');
					}
				}
			}
			System.out.println();
		}
		
	}
}
