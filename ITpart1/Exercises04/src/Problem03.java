
public class Problem03 {

	public static void main(String[] args) {
		
		int num = 22312;
		int temp = num;
		
		int rev = 0;
		
		while (temp != 0) {
			rev = rev * 10 + temp % 10;
			temp /= 10;
		}
		System.out.println("polindrome?");
		System.out.println(rev == num);
		
	}
}
