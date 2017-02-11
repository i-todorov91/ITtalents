
public class Problem01 {

	public static void main(String[] args) {
		
		int[] arr = { 1,3,5,7,2,5,4,3 };
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("The sum is: " + sum);
		
	}
}
