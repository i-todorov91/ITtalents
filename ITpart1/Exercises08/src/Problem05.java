
public class Problem05 {

	public static void main(String[] args) {
		
		int[] arr = { 1,2,3,6,9,4 };
		System.out.println(indexOfMax(arr, 0));
		
	}
	
	static int indexOfMax(int[] arr, int i){
		
		if (i == arr.length - 1) {
			return i;
		}
		
		return arr[i] > arr[indexOfMax(arr, i + 1)] ? i : indexOfMax(arr, i + 1);
		
	}
	
}
