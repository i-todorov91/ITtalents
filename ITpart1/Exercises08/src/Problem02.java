
public class Problem02 {

	public static void main(String[] args) {
		
		int[] arr = { 9,2,1,7,-123,6 };
		System.out.println(minEl(arr, 0));
		
	}
	
	static int minEl(int[] arr, int i){
		
		if (i == arr.length - 1) {
			return arr[i];
		}
		
		return arr[i] < minEl(arr, i + 1) ? arr[i] : minEl(arr, i + 1);
		
	}
	
}
