
public class Problem07 {

	public static void main(String[] args) {
		
		double[] arr = { -5.0, 0.3, 3.2, -8.1, 10.1, -8.8, 10.1 };
		
		double first = 0;
		double second = 0;
		double third = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i]) > first) {
				first = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i]) > second && Math.abs(arr[i]) != first) {
				second = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if ((Math.abs(arr[i]) > third) && (arr[i] != second) && (arr[i] != first) ) {
				third = arr[i];
			}
		}
		
		System.out.println(first + " " + second + " " + third);
		
	}
}
