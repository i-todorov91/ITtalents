
public class Problem03 {

	public static void main(String[] args) {
		
		int[] arr1 = { 1,2,3,4 };
		int[] arr2 = { 5,6,7,8 };
		
		int[] arr3 = combine(arr1, arr2);
		
		for(int i = 0; i < arr3.length; i++){
			System.out.print(arr3[i] + " ");
		}
		
	}
	
	static int[] combine(int[] arr1, int[] arr2){
		int[] arr = new int[arr1.length + arr2.length];
		
		int i = 0;
		
		while(i < arr1.length){
			arr[i] = arr1[i];
			i++;
		}
		
		int j = 0;
		while(i < arr.length){
			arr[i++] = arr2[j++];
		}
		
		return arr;	
	}
	
}
