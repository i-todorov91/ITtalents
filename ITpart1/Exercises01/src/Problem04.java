
public class Problem04 {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 9;
		
		System.out.println("Old numbs: " + x + " " + y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("New numbs: " + x + " " + y);
	}
}
