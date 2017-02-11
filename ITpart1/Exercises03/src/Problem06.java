
public class Problem06 {

	public static void main(String[] args) {
		
		int num = 4119;
		
//		int first = num / 1000;
		int second = num / 100 % 10;
		int third = num / 10 % 10;
		int fourd = num % 10;
		
		if (second == 0 || third == 0 || fourd == 0) {
			System.out.println("has 0");
		} else {
			System.out.println("no 0");
		}
		
	}
}
