
public class Problem01 {

	public static void main(String[] args) {
		
		int[] arr = { 1,2,3,4,5,6,7,8 };
		
		System.out.println(average(arr));
		
	}
	
	static double average(int[] arr){
		double sum = 0;
		double count = arr.length;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / count;
	}
	
}
