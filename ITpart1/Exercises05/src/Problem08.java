
public class Problem08 {

	public static void main(String[] args) {
		
		int[] arr = { 1,3,2,4,3,7 };
		boolean jagged = true;
		
		for (int i = 1; i < arr.length - 1; i++) {
			if ( !((arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) 
					|| (arr[i] < arr[i - 1] && arr[i] < arr[i + 1])) ) {
				jagged = false;
			}
		}
		
		System.out.println(jagged);
		
	}
}
