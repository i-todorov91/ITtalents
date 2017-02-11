
public class Problem04 {

	public static void main(String[] args) {
		
		int num = 3139;
		
		for(int i = 1; i <= num; i++){
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		
	}
}
