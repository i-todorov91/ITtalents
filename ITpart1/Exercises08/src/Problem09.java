
public class Problem09 {

	public static void main(String[] args) {
		
		int x = 12;
		int y = 4;
		
		System.out.println(mulOf(x, y));
		
	}
	
	static int mulOf(int x, int y){
		
		if (y == 1) {
			return x;
		}
		return x + mulOf(x, --y);
		
	}
	
}
