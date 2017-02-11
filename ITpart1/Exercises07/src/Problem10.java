import java.util.Arrays;

public class Problem10 {

	public static void main(String[] args) {
		
		int[] arr1 = { 1,4,8 };
		int[] arr2 = { 3,5,7,9 };
		
		System.out.println(Arrays.toString(merge(arr1, arr2)));
		
	}
	
	static int[] merge(int[] arr1, int[] arr2){
		
		int[] newArr = new int[arr1.length + arr2.length];
		int i1 = 0;
		int i2 = 0;
		for (int i = 0; i < newArr.length; i++) {
			if (i1 < arr1.length && i2 < arr2.length) {
				if (arr1[i1] < arr2[i2]) {
					newArr[i] = arr1[i1];
					i1++;
					continue;
				} else {
					newArr[i]= arr2[i2];
					i2++;
					continue;
				}
			}
			if (i1 < arr1.length && i2 >= arr2.length) {
				newArr[i] = arr1[i1];
				i1++;
				continue;
			}
			if (i1 >= arr1.length && i2 < arr2.length) {
				newArr[i]= arr2[i2];
				i2++;
				continue;
			}
			
		}
		return newArr;
		
	}
	
}
