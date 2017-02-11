
public class Problem05 {

	public static void main(String[] args) {
		
		int[] arr = { 1,2,3,4,5,6,7 };
		
		double mid = 0;
		int sum = 0;
		double count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			count++;
			sum += arr[i];
		}
		mid = sum / count;
		System.out.println(mid);
		
		int nearest = arr[0];
		double token = nearest % mid;
		double tokenMin = nearest % mid;
		
		for (int i = 1; i < arr.length; i++) {
			token = arr[i] % mid;
			if (tokenMin > token) {
				nearest = arr[i];
			}
		}
		System.out.println(nearest);
		
	}
}
