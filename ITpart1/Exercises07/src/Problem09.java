import java.util.Arrays;

public class Problem09 {

	public static void main(String[] args) {
		
		int[] arr1 = { 1,4,8,3 };
		int[] arr2 = { 3,9,7,5 };
		
		System.out.println(Arrays.toString(minElements(arr1, arr2)));
		
	}
	
	static int[] minElements(int[] arr1, int[] arr2){
		
		int[] newArr = new int[arr1.length];
		
		for (int i = 0; i < arr2.length; i++) {
			if (arr1[i] < arr2[i]) {
				newArr[i] = arr1[i];
			} else {
				newArr[i] = arr2[i];
			}
		}
		return newArr;
	}
	
}
