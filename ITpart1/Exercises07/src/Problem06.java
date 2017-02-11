
public class Problem06 {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		int c = 5;
		
		System.out.println(canFormTriangle(a, b, c));
		
	}
	
	static boolean canFormTriangle(int a, int b, int c){
		
		return (a + b) > c && (a + c) > b && (b + c) > a;
		
	}
	
}
