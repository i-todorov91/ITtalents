
public class Problem07 {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 10;

		int c = a ^ b;
		
		int numBin = 0;
		int dig = 1;
		
		while (c != 0) {
			
			numBin += c % 2 * dig;
			dig *= 10;
			c /= 2;
	
		}
	
		System.out.println(numBin);
		
	}
}
