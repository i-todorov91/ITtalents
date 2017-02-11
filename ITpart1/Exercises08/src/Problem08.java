
public class Problem08 {

	public static void main(String[] args) {
		
		int num = 11;
		System.out.println(isPrime(num, 2));
		
	}
	
	static boolean isPrime(int num, int i){
		
		if (i == num - 1) {
			return num % i != 0;
		}
		
		return num % i != 0 && isPrime(num, i + 1);
		
	}
	
}
