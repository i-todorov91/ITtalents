
public class Problem03 {

	public static void main(String[] args) {
		
		int[] arr = { 1,2,3,4,5,6,7,8 };
		print(arr);
		
	}
	
	static void print(int[] arr){
		
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		
	}
	
}
