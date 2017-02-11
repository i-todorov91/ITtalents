
public class Problem07 {

	public static void main(String[] args) {
		
		int h = 6;
		
		for( int i = 1; i <= h; i++){
			for (int j = i; j <= h; j++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print(i);
			} else {
				System.out.print(i);
				for (int j = 0; j < i * 2 - 3; j++) {
					System.out.print("*");
				}
				System.out.print(i);
			}
			System.out.println();
		}
		
		for( int i = h - 1; i >= 1; i--){
			for (int j = i; j <= h; j++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print(i);
			} else {
				System.out.print(i);
				for (int j = 0; j < i * 2 - 3; j++) {
					System.out.print("*");
				}
				System.out.print(i);
				
			}
			System.out.println();
		}
		
	}
}
