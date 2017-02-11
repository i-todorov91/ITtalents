
public class Problem10 {

	public static void main(String[] args) {
		
		byte a = 12;
		byte b = 13;
		byte c = 3;
		
		byte result = (byte) (a & b);
		result = (byte) ~result; 
		result = (byte) (result | c);
		result = (byte) ~result;
		
		int numBin = 0;
		int dig = 1;
		
		while (result != 0) {
			
			numBin += result % 2 * dig;
			dig *= 10;
			result /= 2;
	
		}
	
		System.out.println(numBin);
	}
}
