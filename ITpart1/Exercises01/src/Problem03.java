
public class Problem03 {

	public static void main(String[] args) {
		

		int threeD = 963;
		
		int first = threeD / 100;
		int second = threeD % 100 / 10;
		int third = threeD % 10;
		
		int rev = third * 100 + second * 10 + first;
		
		System.out.println("New numbers is: " + rev);
		
		
	}
}
