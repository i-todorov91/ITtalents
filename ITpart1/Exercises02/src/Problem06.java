
public class Problem06 {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 1;
		int c = 2;
		
		int num;
		num = ((1 << b) ^ a);
		num = ((1 << c) ^ num);
		
		System.out.println(num);
		
	}
}
