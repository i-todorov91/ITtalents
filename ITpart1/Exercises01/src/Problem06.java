
public class Problem06 {

	public static void main(String[] args) {
		
		int x = 4821;
		
		int first = x / 1000;
		int second = x % 1000 / 100;
		int third = x % 100 / 10;
		int fourth = x % 10;
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(fourth);
		
		
	}
}
