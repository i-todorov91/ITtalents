
public class Problem03 {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 4;
		
		int max = num1 - num2;
		int i = (max >> 31) & 1;
		max = num1 - i * max;
		
		System.out.println(max);
		
	}
}
