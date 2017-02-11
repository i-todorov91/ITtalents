import java.util.Arrays;

public class Problem05 {

	public static void main(String[] args) {
		
		int[] arr1 = { 1,2,3,4,5 };
		int[] arr2 = { 1,2,3,4,5 };
		System.out.println(Arrays.toString(mulArrays(arr1, arr2)));
		
	}
	
	static int[] mulArrays(int[] arr1, int[] arr2){
		
		int[] newArr = new int[arr1.length];
		
		for (int i = 0; i < arr2.length; i++) {
			newArr[i] = arr1[i] * arr2[i];
		}
		return newArr;
		
	}
	
}
