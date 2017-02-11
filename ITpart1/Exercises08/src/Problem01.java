
public class Problem01 {

	public static void main(String[] args) {
		
		int a = 5;
		System.out.println(fac(a));
		
	}
	
	static int fac(int n) {
		if (n == 1) {
			return 1;
		}
		return n * fac(n - 1);
	}
	
}
