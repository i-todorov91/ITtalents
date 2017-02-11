
public class Problem03 {

	public static void main(String[] args) {
		
		int temp = 20;
		
		if (temp < -20) {
			System.out.println("freezing");
		} else if (temp >= -20 && temp <= -1) {
			System.out.println("cold");
		} else if (temp >= 0 && temp <= 14) {
			System.out.println("chilly");
		} else if (temp >= 15 && temp <= 25) {
			System.out.println("warm");
		} else if (temp > 25) {
			System.out.println("hot");
		}
		
	}
}
