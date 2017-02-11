
public class Problem03 {

	public static void main(String[] args) {
		
		int[] arr = { 4,3,2,1,5,6,2,9 };
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("The biggest element in the array is: " + max);
		
	}
}
