
public class Problem05 {

	public static void main(String[] args) {
		
		int num = 8;
		
		System.out.println(fibonacci(num));
		
	}
	
	static int fibonacci(int a){
		if (a == 1) {
			return 1;
		}
		if (a == 2) {
			return 1;
		}
		
		return fibonacci(a - 1) + fibonacci(a - 2);
		
	}
	
}
