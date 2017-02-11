
public class Problem0902 {

	public static void main(String[] args) {
		
		int h = 10;
		int stars = 1;
		int spaces = h - 1;
		
		while (h > 0) {
			for (int i = 0; i < spaces; i++){
				System.out.print(" ");
			}
			for (int i = 0; i < stars; i++){ 
				if (i == 0) {					//The cases are divided so you can make different shapes 
					System.out.print("*");
				} else if (i == stars - 1) {
					System.out.print("*");					
				} else if (h == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			stars += 2;
			spaces--;
			h--;
		}
		
	}
}
