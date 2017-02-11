
public class Problem07 {

	public static void main(String[] args) {
		
		char[] arr = { 'a','4','b','2','0' };
		System.out.println(numOfNums(arr));
		
	}
	
	static int numOfNums(char[] arr){
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= '0' && arr[i] <= '9') {
				count++;
			}
		}
		
		return count;
		
	}
	
}
