
public class Problem02 {

	public static void main(String[] args) {
		
		int[] arr = { 1,4,6,7,7,6,4,1 };
		boolean mirrored = true;
		
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[arr.length - 1 - i]) {
				mirrored = false;
			}
		}
		System.out.println(mirrored);
		
	}
}
