import java.util.Arrays;

public class Problem01 {

	public static void main(String[] args) {
		
		int[] arr = { 4,2,5,3,1,2 };
		
		int[] newArr = new int[arr.length];
		
		for (int i = 0; i < arr.length / 2; i++){
			newArr[i] = arr[i];
		}
		for (int i = arr.length - 1, j = newArr.length / 2; j < newArr.length; i--, j++) {
			newArr[j] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));
	}
}
