
public class Problem06 {

	public static void main(String[] args) {
		
		int[] arr = { 5,3,1,5,10,-100,200 };
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 5 && arr[i] % 5 == 0) {
				 System.out.print(arr[i] + " ");
			}
		}
		
	}
}
