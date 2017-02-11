
public class Problem01 {

	public static void main(String[] args) {
		
		int num = 312;
		
		int first = num / 100;
		int second = num % 100 / 10;
		int third = num % 10;
		
		System.out.println( (num % first == 0) && (num % second == 0) && (num % third == 0) );
		
	}
}
