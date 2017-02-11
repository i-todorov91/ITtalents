
public class Problem04 {

	public static void main(String[] args) {
		
		int[] arr = { 1,2,3,4,5,8,6,7 };
		System.out.println(hasDuplicate(arr, 0));
		
	}
	
	static boolean hasDuplicate(int[] arr, int i){
		
		int temp = arr[i];
		boolean hasDup = false;
		if (i == arr.length - 1) {
			return hasDup;
		}
		for (int j = i + 1; j < arr.length; j++) {
			if (temp == arr[j] ) {
				hasDup = true;
				break;
			}
		}
		return hasDup || hasDuplicate(arr, i + 1);
		
	}
	
}
