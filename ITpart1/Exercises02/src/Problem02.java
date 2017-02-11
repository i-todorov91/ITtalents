
public class Problem02 {

	public static void main(String[] args) {
		
		int numInt = 5844;
		
		int numBin = 0;
		int dig = 1;
		
		while (numInt != 0) {
			
			numBin += numInt % 2 * dig;
			dig *= 10;
			numInt /= 2;
	
		}
	
		System.out.println(numBin);
		
	}
}
