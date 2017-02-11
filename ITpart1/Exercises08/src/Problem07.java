
public class Problem07 {

	public static void main(String[] args) {
		
		int start = 5;
		int end = 10;
		int temp = start;
		
		pyramid(start, end, temp);
		
	}
	
	static void pyramid(int s, int e, int temp){
		
		if (temp == e) {
			for (int i = s; i <= e; i++) {
				System.out.print(i + " ");
			}
			return;
		}
		
		for (int i = s; i <= temp; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		pyramid(s, e, temp + 1);
		
	}
	
}
