
public class Problem10 {

	public static void main(String[] args) {
		
		int num = 2;
		int pow = 10;
		
		System.out.println(powerOf(num, pow));
		
	}
	
	static int powerOf(int num, int pow){
		
		if (pow == 1) {
			return num;
		}
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += powerOf(num, pow - 1);
		}
		return sum;
		
	}
	
}
