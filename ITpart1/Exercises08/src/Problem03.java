
public class Problem03 {

	public static void main(String[] args) {
		
		int[] arr = { 1,2,3,4,5,6,7,8 };
		System.out.println(ascending(arr, 0));
		
	}
	
	static boolean ascending(int[] arr, int i){
		
		if (i == arr.length - 1) {
			return arr[i - 1] < arr[i];
		}
		
		return arr[i] < arr[i + 1] && ascending(arr, i + 1);
		
	}
	
}
