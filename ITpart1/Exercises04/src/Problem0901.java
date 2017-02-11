
public class Problem0901 {

	public static void main(String[] args) {
		
		int h = 10;
		int stars = 1;
		int spaces = h - 1;
		
		while (h > 0) {
			for (int i = 0; i < spaces; i++){
				System.out.print(" ");
			}
			for (int i = 0; i < stars; i++){
				System.out.print("*");
			}
			System.out.println();
			stars += 2;
			spaces--;
			h--;
		}
		
	}
}
