
public class Problem05 {

	public static void main(String[] args) {
		
		int firstFile = 2;
		int firstRank = 2;
		int secondFile = 3;
		int secondRank = 2;
		
		char first;
		char second;
		
		if ( (firstFile + firstRank) % 2 == 0) {
			first = 'b';
		} else {
			first = 'w';
		}
		
		if ( (secondFile + secondRank) % 2 == 0) {
			second = 'b';
		} else {
			second = 'w';
		}
		
		if (first == second) {
			System.out.println("same");
		} else {
			System.out.println("differend");
		}
		
	}
}
