
public class Problem08 {

	public static void main(String[] args) {
		
		byte a = -10;
		
		int i = a >> 7;
		
		boolean isNegative = ((i & 1) == 1);
		
		System.out.println(isNegative);
	}
}
