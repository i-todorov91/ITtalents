
public class Problem04 {

	public static void main(String[] args) {
		
		int[] arr = { 1,1,1,1,2,2,2,2,2,1,1,3 };
		
		int el = arr[0];
		int count = 1;
		int countMax = 1;
		int elMax = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			el = arr[i - 1];
			if (el == arr[i]) {
				count++;
			} else {
				if (countMax < count) {
					countMax = count;
					elMax = arr[i - 1];
				}
				count = 1;
			}
		}
		
		for (int i = 0; i < countMax; i++){
			System.out.print(elMax + " ");
		}
		
	}
}
