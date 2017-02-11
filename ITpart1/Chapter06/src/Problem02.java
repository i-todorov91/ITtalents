
public class Problem02 {

	public static void main(String[] args) {
		
		int[] arr1 = { 1,4,2,1 };
		int[] arr2 = { 1,1,5,2 };
		
		for (int i = 0; i < arr2.length; i++) {
			if (arr1[i] < arr2[arr2.length - 1 - i]) {
				System.out.println(arr1[i] + " < " + arr2[arr2.length - 1 - i]);
			} else if (arr1[i] == arr2[arr2.length - 1 - i]) {
				System.out.println(arr1[i] + " = " + arr2[arr2.length - 1 - i]);
			} else {
				System.out.println(arr1[i] + " > " + arr2[arr2.length - 1 - i]);
			}
		}
		
	}
}
