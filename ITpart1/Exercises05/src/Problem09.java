import java.util.Arrays;

public class Problem09 {

	public static void main(String[] args) {
		
		int[] arr1 = { 18,3,7 };
		int[] arr2 = { 7,5,8 };
		int[] arr3 = new int[arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > arr2[i]) {
				arr3[i] = arr1[i];
			} else {
				arr3[i] = arr2[i];
			}
		}
		
		System.out.println(Arrays.toString(arr3));
		
	}
}
