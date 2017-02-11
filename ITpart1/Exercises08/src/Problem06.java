
public class Problem06 {

	public static void main(String[] args) {
		
		int num = 12340;
		System.out.println(rev(num));
		
	}
	
	static int rev(int num){
		
		if (num < 10) {
			return num;
			}
		
		int n = num;
		int pow = 1;

		while (n >= 10) {
			n = n / 10;
			pow = pow * 10;
		}

		return (num % 10 * pow + rev(num / 10));
		
	}
	
}
