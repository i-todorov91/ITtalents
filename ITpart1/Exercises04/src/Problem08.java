
public class Problem08 {

	public static void main(String[] args) {
		
		int dim = 10;
		char inside = ')';
		
		for (int i = 1; i <= dim; i++){
			for (int j = 1; j <= dim; j++){
				if (i == 1 || i == dim) {
					System.out.print("*");
				} else {
					if (j == 1 || j == dim) {
						System.out.print("*");
					} else {
						System.out.print(inside);
					}
				}
			}
			System.out.println();
		}
		
	}
}
