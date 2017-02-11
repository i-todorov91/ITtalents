
public class Problem05 {

	public static void main(String[] args) {
		
		long num1 = 20l;
		long num2 = 4l;
		
		long f1 = 1l;
		long f2 = 1l;
		
		for (long i = 2l; i <= num1; i++){
			f1 *= i;
		}
		for (long i = 2l; i <= num2; i++){
			f2 *= i;
		}
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1 + f2);
		
		
	}
}
