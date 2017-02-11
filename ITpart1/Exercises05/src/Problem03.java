import java.util.Arrays;

public class Problem03 {

	public static void main(String[] args) {
		
		int[] arr = { 2,5,2,6,1,4,1 };
		int[] newArr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i == arr.length - 1) {
				newArr[i] = arr[i];
			} else {
				newArr[i]= arr[i - 1] + arr[i + 1];
			}
		}
		
		System.out.println(Arrays.toString(newArr));
		
	}
}
