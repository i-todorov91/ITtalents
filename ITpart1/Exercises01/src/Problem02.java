
public class Problem02 {

	public static void main(String[] args) {
		
		int a1 = 1;
		int a2 = 2;
		int a3 = 3;
		
		int temp = a1;
		
		a1 = a2;
		a2 = a3;
		a3 = temp;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
	}
}
