
public class Problem04 {

	public static void main(String[] args) {
		
		int num = 111;
		
		int first = num / 100;
		int second = num % 100 / 10;
		int third = num % 10;
		
		if (first == second && second == third) {
			System.out.println("Equal!");
		} else if (first > second && second > third) {
			System.out.println("descending");
		} else if (first < second && second < third) {
			System.out.println("ascending");
		} else {
			System.out.println("shuffled");
		}
		
	}
}
